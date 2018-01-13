/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superjump;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Dipta
 */
public class Obstacle {

    int ox, oy, obx, oby;
    int scorePoint;
    static Image obstacle;
    ImageIcon ObIcon;//= new ImageIcon("Res/pipe"+(int)(Math.random()*10)+".png");
 int obstacleNumber;
    String obstacleImageFileNameExtension ;
    ImageIcon destroyedObstacleIcon = new ImageIcon("Res/obstacleDestroyed.gif" );
    Image obstacleDestroyedImage = destroyedObstacleIcon.getImage();
    public Obstacle() {
        obstacleNumber =  (int) (Math.random() * 10) ;
                if(obstacleNumber == 5 ){//|| obstacleNumber == 8){
             obstacleImageFileNameExtension = ".gif";   // Animated ones
        }
        else{
            obstacleImageFileNameExtension = ".png";
        }
        ObIcon = new ImageIcon("Res/obstacle" + obstacleNumber + obstacleImageFileNameExtension);
        obstacle = ObIcon.getImage();
        ox = 600;
        oy = 285;

    }

    public int scorePoint() {

        scorePoint = (1 + (int) (Math.random() * 10)) * 10;

        return scorePoint;
    }

    public void show() {

    }

    public int getX() {
        return ox;
    }

    public int getY() {
        return oy;
    }

    public Image getImage() {
        return obstacle;
    }
     public void setObstacleDestroyedImage() {
         
        obstacle = obstacleDestroyedImage;
    }
}
