/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.*;

/**
 *
 * @author 2
 */
public class Menu {

    public static Rectangle playButton = new Rectangle(10, 50, 100, 37);// x coordinate,y coordinate, width, height
    public static Rectangle resumeButton = new Rectangle(10, 50, 150, 37);// x coordinate,y coordinate, width, height
    public static Rectangle quitButton = new Rectangle(10, 154, 100, 37);// x coordinate,y coordinate, width, height

    public static void render(Player player, Graphics graphicsDevice) {
        Graphics2D graphicsDevice2d = (Graphics2D) graphicsDevice;
        // Defines fonts
        Font arialLarge = new Font("arial", Font.BOLD, 45);
        Font ariaMedium = new Font("arial", Font.BOLD, 30);
        Font arialSmall = new Font("arial", Font.BOLD, 15);

        if (Board.state != Board.STATE.PAUSED) {
            graphicsDevice.setFont(arialLarge);
            graphicsDevice.setColor(Color.white);
            graphicsDevice.drawString("Super Jump", 10, 40);

        }
        if (Board.state != Board.STATE.PAUSED) {
            graphicsDevice.setFont(ariaMedium);

            graphicsDevice.drawString("Play", playButton.x + 19, playButton.y + 29);
            graphicsDevice2d.draw(playButton);
        } else {// shows "Resume" button during pause time
            graphicsDevice.setFont(ariaMedium);
            graphicsDevice.setColor(Color.green);
            graphicsDevice.drawString("Resume", playButton.x + 19, playButton.y + 29);
            graphicsDevice2d.draw(resumeButton);
            graphicsDevice.setColor(Color.red);
        }
//        graphicsDevice.drawString("Help", helpButton.x + 19, helpButton.y + 29);
//        graphicsDevice2d.draw(helpButton);
        graphicsDevice.drawString("Quit", quitButton.x + 19, quitButton.y + 29);
        graphicsDevice2d.draw(quitButton);

        if (Board.state != Board.STATE.PAUSED) {
            graphicsDevice.setFont(arialSmall);
            graphicsDevice.drawString("Version 1.11", 500, 380);
        }
// Shows player's result when Game is over
        if (Board.state == Board.STATE.END) {
            graphicsDevice.setFont(new Font("arial", Font.BOLD, 30));
            graphicsDevice.setColor(Color.red);
            graphicsDevice.drawString("GAME OVER ! ", 355, 70);

            graphicsDevice.setFont(new Font("arial", Font.BOLD, 30));
            graphicsDevice.setColor(Color.BLUE);
            graphicsDevice.drawString("Score: " + player.score, 375, 120);
            graphicsDevice.drawString("Coin: " + player.coinCount, 375, 170);
            graphicsDevice.drawString("Life: " + player.life, 375, 220);
            
//            String endMenuAudioFilePath = "Res/endMenuMusic.wav";
//            AudioPlayer endMenuAudioPlayer = new AudioPlayer();
//            endMenuAudioPlayer.play(endMenuAudioFilePath);

//            Board.player = null; // removes previous player from board.
        }
//
//        String audioFilePath = "Res/Intro_Wind-Mark_DiAngelo-844491759.wav";
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play(audioFilePath);
    }

}
