/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.*;   //Imported to allow use of Image
import java.awt.event.*;   //Imported to allow use of ActionListener
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import superjump.Board.STATE;

/**
 *
 * @author 2
 */
public class Board extends JPanel implements ActionListener, LineListener {

    public static Player player;   //Instance of Player class
    Image background, menuBackground, endMenuBackground;      //The background images
    Timer timer;         //A timer
    private final Menu Menu;

    Obstacle obs = new Obstacle();
//    private Frame frame;
    boolean threadRunning = false;
    int showCollisionCount = 0;
    int PlayerGotHitReddishImageShowedCounter = 0;
    int showLifeIncreasedNotificationCount = 0;

    boolean gotHit = false; //obstacle hits player

//    Coin[] newCoin = new Coin[20];
//    int visibleCoinLimit = 1;
    boolean coinThreadRunning = false;

    /**
     *
     */
    public static Coin newCoin = new Coin();

    @Override
    public void update(LineEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static enum STATE {  // States of the game. controls conditions and Menu selection

        MENU, GAME, PAUSED, END;
    }

    public static STATE state = STATE.MENU;

    public Board() {

        this.addMouseListener(new MouseInput()); // Can we put these to a separate class instead of private class
        player = new Player();       //Start running Player class       
        Menu = new Menu();

        addKeyListener(new AL());   //Listen for keys
        setFocusable(true);                                                                                                                  //Allows movement         
        ImageIcon i = new ImageIcon("Res/Menu.jpg");  //Image for Menu
        menuBackground = i.getImage();
        i = new ImageIcon("Res/endMenu.jpg");  //Image for endMenu
        endMenuBackground = i.getImage();
        i = new ImageIcon("Res/Background.png");  //Image for background
        background = i.getImage();  //Give the background the image
        timer = new Timer(20, this);   //Timer set to update "this" class every 20 milliseconds(Approximately 50fps)
        timer.start();  //Actually start the timer
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();    //Call the move method from the Player class          
        repaint();   //Repaint
    }

    @Override
    public void paintComponent(Graphics graphicsDevice) {   //Graphics method
        if (state == STATE.GAME) { // If true then Inside playing State
            super.paintComponent(graphicsDevice);
            Graphics2D graphicsDevice2d = (Graphics2D) graphicsDevice; //casts 2d graphics(or however you would explain it)
            graphicsDevice2d.drawImage(background, -player.newX, 0, null); //Draw the background image
            graphicsDevice2d.drawImage(background, -player.secondNewX, 0, null); //Draw the background image 
            if (-player.newX < -575) { //If going forwards   

                player.newX = -575;    //Start placing forwards every 575px in front on the last one

                //____________________ obstacle block starts _________________________
                if (!threadRunning) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            threadRunning = true;
//                            int motionControllerSleepTime = 0;
                            while (true && state == STATE.GAME) {
                                if (obs.ox == -575) {
                                    try {
                                        Thread.sleep(100);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                    }
//                                    obs.ox = 575;                      
//                                    obs = null; //Help the garbage collector.
                                    obs = new Obstacle();
                                    gotHit = false; //obstacle can hit player
//                                    obs.ox = 600;

                                } else {
//                                    try {
//                                        Thread.sleep(motionControllerSleepTime++);
//                                    } catch (InterruptedException ex) {
//                                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
                                    obs.ox--;
//                                    System.out.println(Thread.currentThread().getName());
                                    if (obs.ox <= 105 && obs.ox >= 46 && gotHit == false) { // if obstacle is close to player then perform check
                                        Rectangle playerRectangle = new Rectangle(player.getX(), player.getY(), 30, 40); // x,y coordinates and width, height
                                        Rectangle obstacleRectangle = new Rectangle(obs.ox, obs.oy, 29, 41);             // x,y coordinates and width, height                                    
                                        if (playerRectangle.intersects(obstacleRectangle) && gotHit == false) {

                                            player.life = player.life - 1; // Decreasing  Life by 1

                                            gotHit = true; // prevents notification of another collision with the same obstacle
                                            obs.setObstacleDestroyedImage();
//                                            obs.ox = -575;
//                                        playerRectangle = null; //Help the garbage collector.
//                                        obstacleRectangle = null;

                                           // String hitObstacleAudioFilePath = "Res/hitObstacle.wav";
                                            //AudioPlayer hitObstacleAudioPlayer = new AudioPlayer();
                                            //hitObstacleAudioPlayer.play(hitObstacleAudioFilePath);

                                            System.out.println(Thread.currentThread().getName());
                                            System.out.println("Collision");
                                            if (player.life == 0) {
//                                                visibleCoinLimit = 0;
//                                                newCoin.cx= -575;
                                                state = STATE.END; // Ending the current player's game 
//                                            Thread.stop();
                                                return;            // And returning to Game Menu

                                            }
                                            PlayerGotHitReddishImageShowedCounter = 1000;
                                            showCollisionCount = 20;
                                        }
//                                    playerRectangle = null; //Help the grabage collector.
//                                    obstacleRectangle = null;
                                    }
                                    if (!gotHit && obs.ox == 45) {
                                        player.score = player.score + obs.scorePoint();
//                                        String passedObstacleAudioFilePath = "Res/passedObstacle.wav";
//                                        AudioPlayer passedObstacleAudioPlayer = new AudioPlayer();
//                                        passedObstacleAudioPlayer.play(passedObstacleAudioFilePath);
                                        if (player.score > 10000) {
                                            player.score = player.score - 10000;
                                            player.life = player.life + 1;
                                            //String lifeUpAudioFilePath = "Res/lifeUp.wav";
                                            //AudioPlayer lifeUpAudioPlayer = new AudioPlayer();
                                            //lifeUpAudioPlayer.play(lifeUpAudioFilePath);
//                                            break;
                                            showLifeIncreasedNotificationCount = 40;
                                        }
                                    }
                                    try {
                                        Thread.sleep(20);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                try {
                                    Thread.sleep(30);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                threadRunning = false;
                            }

                        }
                    }
                    ).start();

                }
                //___________________ obstacle block ends _________________________    

                //___________________ coin block starts _________________________ 
                if (!coinThreadRunning) {

                    if (player.score > 0 && player.score % 2 == 0) {
//            if (visibleCoinLimit <= 5 ) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                coinThreadRunning = true;
                                int motionControllerSleepTime = 100;
//                        visibleCoinLimit = visibleCoinLimit + 1;
//                        int i = 1;
//                        Coin tempNewCoin = new Coin();
//                        for (i = 1; i <= 10; i++) {
//                            if (newCoin[i] == null) {
//                                newCoin[i] = tempNewCoin;
//                                break;
//                            }
//                        }
//                            try {
//                                Thread.sleep(100);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
//                            }

                                boolean haveCoin = false;
                                while (true && state == STATE.GAME) {
                                    if (newCoin.cx == -575) {
                                        try {
                                            Thread.sleep(100);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                        }
//                               newCoin[i] = null;
//                                visibleCoinLimit = visibleCoinLimit - 1;
                                        newCoin = new Coin();
                                        haveCoin = false;
//                                break;
                                    } else {

                                        newCoin.cx--;
//                                    System.out.println(Thread.currentThread().getName());
                                        if (newCoin.cx <= 105 && newCoin.cx >= 55 && haveCoin == false) { // if obstacle is close to player then perform check
                                            Rectangle playerRectangle = new Rectangle(player.getX(), player.getY(), 30, 40); // x,y coordinates and width, height
                                            Rectangle newCoinRectangle = new Rectangle(newCoin.cx, newCoin.cy, 20, 20);             // x,y coordinates and width, height                                    
                                            if (playerRectangle.intersects(newCoinRectangle) && haveCoin == false) {
                                                player.coinCount = player.coinCount + newCoin.coinValue(); // Add coin value to players coin total
                                                haveCoin = true; // prevents notification of another collision with the same coin
                                                newCoin.cx = -575;

                                              //  String gotCoinAudioFilePath = "Res/gotCoin.wav";
                                              //  AudioPlayer gotCoinAudioPlayer = new AudioPlayer();
                                              //  gotCoinAudioPlayer.play(gotCoinAudioFilePath);

//                                        playerRectangle = null; //Help the garbage collector.
//                                        obstacleRectangle = null;
                                                System.out.println(Thread.currentThread().getName());
                                                System.out.println("Got Coin!");
                                                if (player.coinCount >= 1000) {
                                                    player.coinCount = player.coinCount - 1000;
                                                    player.life = player.life + 1;

                                                //    String lifeUpAudioFilePath = "Res/lifeUp.wav";
                                                //    AudioPlayer lifeUpAudioPlayer = new AudioPlayer();
                                                //    lifeUpAudioPlayer.play(lifeUpAudioFilePath);

//                                            break;
                                                    showLifeIncreasedNotificationCount = 40;
                                                }

                                            }
//                                    playerRectangle = null; //Help the grabage collector.
//                                    obstacleRectangle = null;
                                        }
                                        try {
                                            Thread.sleep(100);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                    try {
                                        Thread.sleep(100);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    coinThreadRunning = false;
                                }
                            }
                        }).start();
//
//            }
                    }
                }
                //___________________ coin block ends _________________________  

            } else if (-player.newX > 575) //If going backwards
            {
                player.newX = 575;   //Start placing backwards every 575px behind the last one
            }
            if (-player.secondNewX < -575) //If going forwards
            {
                player.secondNewX = -575;   //Start placing forwards every 575px in front on the last one
            }
//            else if (-player.secondNewX > 575) //If going backwards
//            {
//                player.secondNewX = 575;     //Start placing backgrounds every 575px behind the last one
//            }

            //--------------shows the "Collision Occurred !" notification for some time--------
            if (gotHit || showCollisionCount > 0) {
                graphicsDevice2d.setFont(new Font("arial", Font.BOLD, 30));  // Collision notification
                graphicsDevice2d.setColor(Color.RED);                        // Collision notification
                graphicsDevice2d.drawString("Collision !", 180, 100); // Collision notification
                showCollisionCount = showCollisionCount - 1;
            }
            //--------------------------------------------------------------------------------------------
            //--------------shows the "Life Increased !" notification for some time--------
            if (showLifeIncreasedNotificationCount > 0) {
                graphicsDevice2d.setFont(new Font("arial", Font.BOLD, 30));  // Collision notification
                graphicsDevice2d.setColor(Color.green);                        // Collision notification
                graphicsDevice2d.drawString("Life !", 190, 70); // Collision notification
                showLifeIncreasedNotificationCount = showLifeIncreasedNotificationCount - 1;
            }
            //--------------------------------------------------------------------------------------------
            graphicsDevice.setFont(new Font("arial", Font.BOLD, 30));
            graphicsDevice.setColor(Color.orange);
            graphicsDevice.drawString("Life: " + player.life, 5, 25); // Showing player's Lifes on the Left Side.
            graphicsDevice.drawString("Coin: " + player.coinCount, 150, 25);// Showing player's Coin count in the middle 
            graphicsDevice.drawString("Score: " + player.score, 350, 25);// showing player's Score count on the right side
            graphicsDevice.setColor(Color.white);
            graphicsDevice.setFont(new Font("arial", Font.BOLD, 20));
            graphicsDevice.drawString("Space=Jump", 5, 380);
            graphicsDevice.drawString("Esc=Pause", 485, 380);
            if (!gotHit && showCollisionCount <= 0) {
                graphicsDevice2d.drawImage(player.getImage(), player.getX(), player.getY(), null);  //Draw the Player at the position he is currently(Coordinate values taken from Player class)
            } else {

                graphicsDevice2d.drawImage(player.getGotHitImage(), player.getX(), player.getY(), null);  //Draw the Injured Reddish Player at the position he is currently(Coordinate values taken from Player class)
                PlayerGotHitReddishImageShowedCounter = PlayerGotHitReddishImageShowedCounter - 1;
            }

            graphicsDevice2d.drawImage(obs.getImage(), obs.ox, obs.oy, null);

//             if (player.score > 0 && state == STATE.GAME) {
//            for (int j = 1; j <= 10; j++) {
//                if (newCoin[j] != null) {
            graphicsDevice2d.drawImage(newCoin.getImage(), newCoin.cx, newCoin.cy, null);// Paint the coin image

//                }
//            }
//             }
        } else {
            if (STATE.MENU == state) {
                graphicsDevice.drawImage(menuBackground, 0, 0, null);   // Background for Menu             
            } else if (STATE.END == state) {
                newCoin.cx = -575;
                graphicsDevice.drawImage(endMenuBackground, 0, 0, null);// Background for GAME OVER!
            } else if (STATE.PAUSED == state) {
                newCoin.cx = -575; //Resets coin position
            }

            Menu.render(player, graphicsDevice);  // Shows Menu with or without player info
//            player.life = 2; // Resets the life
//            player.coin = 0; //
//            player.score = 0;//
        }

    }

    private class AL extends KeyAdapter {  //Action Listener extends key adapter

        @Override
        public void keyPressed(KeyEvent e) {  //On key press 
            player.keyPressed(e);      //Send whatever key was pressed  TO the keyPressed  method in the Player class 
        }

        @Override
        public void keyReleased(KeyEvent e) {  //On key release
            player.keyReleased(e);    //Send whatever key was released TO the keyReleased method in the Player class
        }
    }
}
