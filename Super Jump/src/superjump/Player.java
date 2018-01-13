/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import static superjump.Board.state;

/**
 *
 * @author 2
 */
public class Player {

    int life = 2, coinCount = 0, score = 0;
    boolean threadRunning = false;
    int motionControllerSleepTime = 0;
    int xChange, yChange, newX, secondNewX, distanceTraveled; //x coordinate,change in x coordinate,y coordinate,1st rep bg,2nd rep bg,dist traveled
    static int y, x;
    Image player;  //The player variable
    //ImageIcon playerFacingLeft = new ImageIcon("e:/PlayerFacingLeft.png");  //Image for player while he is     turning left
    ImageIcon playerFacingRight = new ImageIcon("Res/PlayerFacingRight.png");//Image for player while he is turning right
    ImageIcon playerFacingRightGotHit = new ImageIcon("Res/PlayerFacingRightGotHit.gif");//Image for player while he has got hit

    public Player() {
        player = playerFacingRight.getImage();  //Give the player the image
        x = 75;   //The original x position of the player
        y = 285; //The original y position of the player
        newX = -0;    //Repeating background 1
        secondNewX = -575;  //Repeating background 2
//         xChange = 3;
//        distanceTraveled = 24;
    }

    public void move() {
        newX = newX + xChange;
        secondNewX = secondNewX + xChange;

        try {
            Thread.sleep(7);//motionControllerSleepTime++);
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//        if (x > 0 && x < 100) { //If the player is within the moving area
//            x = x + xChange;    //The x position is updated to become itself+the amount you moved
//            newX = newX + xChange;  //Place the repeating background at regular speed
//            secondNewX = secondNewX + xChange;  //Place the repeating background at regular speed
//        }
//        if (x <= 0) {   //If the player has reached he very left side of the screen(0px)
//            x = 1;     //Move him up a pixel so he can move again
//            newX = newX + (xChange * (int) 0.5);   //Place the background at a slower speed since Mario stops moving
//            secondNewX = secondNewX + (xChange * (int) 0.5); //Place the background at a slower speed since Mario stops moving
//        }
//        if (x >= 100) {  //If the player has reached the center of the screen(300px)
//            x = 99;     //Move him down a pixel so he can move again
//            newX = newX + (xChange * (int) 0.5);   //Place the background at a slower speed since Mario stops moving
//            secondNewX = secondNewX + (xChange * (int) 0.5);  //Place the background at a slower speed since Mario stops moving
//        }
//        if (xChange > 0) {
//            distanceTraveled++;
//        } else if (xChange < 0) {
//            distanceTraveled--;
//        }
//        if (distanceTraveled > 104) {
//            x = 99;
//        }
//        if (x == 1 && xChange < 0) {
//            distanceTraveled++;
//        }
//        if (distanceTraveled < 104) {
//            newX = 0;
//            secondNewX = -575;
//        }

    public int getX() {
        return x;
    } //This method will return the x.      Is used by other classes

    public int getY() {
        return y;
    }   //This method will return the y.      Is used by other classes

    public Image getImage() {
        return player;
    }   //This method will return the player. Is used by other classes

    public Image getGotHitImage() {

        return playerFacingRightGotHit.getImage();

    }   //This method will return the player. Is used by other classes

    public void keyPressed(KeyEvent e) { //Called from the Board class, the argument is whatever key was pressed
        int key = e.getKeyCode();  //The key originally sent from the Board class

        if (key == KeyEvent.VK_ESCAPE && state == Board.STATE.GAME)//VK_LEFT || key == KeyEvent.VK_RIGHT) //If the left or right key was released
        {
            state = Board.STATE.PAUSED;
            xChange = 0;  //Stop moving
            newX = -0;    //Repeating background 1
            secondNewX = -575;  //Repeating background 2
        }

        if (key == KeyEvent.VK_SPACE) {  //If the key sent was Space    
//            if (y == 285) {
//                String jumpAudioFilePath = "Res/jump.wav";
//                AudioPlayer jumpAudioPlayer = new AudioPlayer();
//                jumpAudioPlayer.play(jumpAudioFilePath);               
//                
//            } 
//                else {
//                String kickInAirAudioFilePath = "Res/kickInAir.wav";
//                AudioPlayer kickInAirAudioPlayer = new AudioPlayer();
//                kickInAirAudioPlayer.play(kickInAirAudioFilePath);
//            }
            player = playerFacingRight.getImage(); //Make the player face leftwards
            yChange = 55;

            if (y > 230) {
                y = y - yChange;
            }

            if (!threadRunning) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        threadRunning = true;
                        while (true && y < 285) {
                            yChange++;
                            y++;
                            if (y == 285) {
                                break;
                            }
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        threadRunning = false;
                    }
                }).start();
            }
        }
        if (key == KeyEvent.VK_RIGHT) {  //If the key sent was RIGHT
            player = playerFacingRight.getImage();  //Make the player face rightwards

//            if (distanceTraveled < 104) {
            xChange = 3;

//            }
        }
    }

    public void keyReleased(KeyEvent e) { //Called from the Board class, the argument is whatever key was released
        int key = e.getKeyCode();  //The key originally sent from the Board class

//        if (key == KeyEvent.VK_ESCAPE)//VK_LEFT || key == KeyEvent.VK_RIGHT) //If the left or right key was released
//        {
//            State = Board.STATE.PAUSED;
//            xChange = 0;  //Stop moving
//        }
    }
}
