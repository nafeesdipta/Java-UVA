/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Nafees
 */
public class Coin {

    int cx = 600, cy = 230;
    int coinValue;
    boolean haveCoin = false;
    static Image coinImage;
    ImageIcon coinIcon; //= new ImageIcon("Res/coin.png");
    int coinNumber;
    String coinImageFileNameExtension;

    public Coin() {

        coinNumber = (int) (Math.random() * 10);
//        if(coinNumber == 7 || coinNumber == 8){
        coinImageFileNameExtension = ".gif";
//        }
//        else{
//            coinImageFileNameExtension = ".png";
//        }

        coinIcon = new ImageIcon("Res/coin" + coinNumber + coinImageFileNameExtension);
        coinImage = coinIcon.getImage();
        cx = 600 + (int) (Math.random() * 100);
        if (coinNumber == 1 || coinNumber == 6) {
            cy = 305;
        } else {
            cy = 210 + ((int) (Math.random() * 100));
        }
//       cy = 211 + ((int) (Math.random() * 100));
        if (cy > 305) {
            cy = 305;
        }

    }

    public int coinValue() {
        if (coinNumber == 1 || coinNumber == 5 || coinNumber == 6 || coinNumber == 9) {// value for diamonds, pearl
            coinValue = 100;
        } else {
            coinValue = (1 + (int) (Math.random() * 10)) * 5;
        }
        return coinValue;
    }

    public int getX() {
        return cx;
    }

    public int getY() {
        return cy;
    }

    public Image getImage() {
        return coinImage;
    }
}
