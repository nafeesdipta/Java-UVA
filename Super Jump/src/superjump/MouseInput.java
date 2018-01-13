/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import static superjump.Frame.frame;

/**
 *
 * @author 2
 */
public class MouseInput implements MouseListener {

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (Board.state == Board.STATE.MENU || Board.state == Board.STATE.END || Board.state == Board.STATE.PAUSED) {
            if (mx >= 10 && mx <= 110 && Board.state != Board.STATE.PAUSED) {
                if (my >= 50 && my <= 87) {
//                    if (Board.State != Board.STATE.PAUSED) {
                    Frame.previousBoard = Frame.currentBoard;//Go to board class
                    Frame.currentBoard = new Board();//Go to board class
                    Frame.frame.getContentPane().add(Frame.currentBoard);//Go to board class
//                     Frame.frame.getContentPane().remove(Frame.previousBoard);//Go to board class

                    Board.state = Board.STATE.GAME;
//                    }

                }
                if (my >= 102 && my <= 139) {
                    //HELP
                }
                if (my >= 154 && my <= 191) {
                    System.exit(1);
//                     System.out.println("Collision");
                }
            }

            if (mx >= 10 && mx <= 160) {
                if (my >= 50 && my <= 87) {
                    if (Board.state == Board.STATE.PAUSED) {
                        Board.newCoin.cx = -575;
                        Board.state = Board.STATE.GAME;
                    }
                }
            }
            if (mx >= 10 && mx <= 110) {
                if (my >= 154 && my <= 191) {
                    if (Board.state == Board.STATE.PAUSED) {
                        System.exit(1);
                    }
                }
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
