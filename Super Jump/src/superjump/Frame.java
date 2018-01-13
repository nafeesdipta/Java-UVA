/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import javax.swing.JFrame;

/**
 *
 * @author 2
 */
public class Frame {

    /**
     *
     */
    // Outside the main(). Will Try remove the current Board and add new one when game is overa and player again select "play"
    public static JFrame frame = new JFrame("Super Jump 1.11 by Voyage");//Create JFrame called frame
    public static Board previousBoard, currentBoard = new Board();

    public static void main(String[] args) {

        frame.getContentPane().add(currentBoard);//Go to board class
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Make frame close on X click
        frame.setSize(600, 413);       //Set the frame size to the size of the background
        frame.setResizable(false);   //Make sure the user can't resize the frame
        frame.setLocation(20, 50);  //Place the frame in a nicer position
        frame.setVisible(true);     //Make the frame visible

        int frameWidth = frame.getContentPane().getWidth(); // can be used to set limit
        int frameHeight = frame.getContentPane().getHeight(); // can be used to set limit

    }

}
