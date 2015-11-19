/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author User
 */
public class GameGraphic extends javax.swing.JFrame{
    
    private GameLogic game;
    
    JLabel [][] matriz;

    public GameGraphic(GameLogic game) {
        this.game = game;
        int sizeImage = game.getSizeImage();
        matriz = new JLabel[game.getSize()][game.getSize()];
        
       // this.setSize(num*5,num*5);
        for (int x = 0; x < game.getSize(); x++) {
            for (int y = 0; y < game.getSize(); y++) {
                JLabel posMatrix = new JLabel();
            
                
                posMatrix.setBounds(x*sizeImage, y*sizeImage, sizeImage, sizeImage);
                posMatrix.setIcon(setIcon(sizeImage,"/bombermanImages/BarrierBlock.png"));
                matriz[x][y] = posMatrix;
                this.add(posMatrix);
                
                if(((x%2)!=0) ||((y%2)!=0)){

                    matriz[x][y].setIcon(setIcon(sizeImage,"/bombermanImages/EmptySpace.png"));
                }
                

            }
        }
        for(int x = 0; x < matriz.length;x++){
            matriz [0][x].setIcon(setIcon(sizeImage,"/bombermanImages/BarrierBlock.png"));
            matriz [matriz.length-1][x].setIcon(setIcon(sizeImage,"/bombermanImages/BarrierBlock.png"));
            matriz [x][0].setIcon(setIcon(sizeImage,"/bombermanImages/BarrierBlock.png"));
            matriz [x][matriz.length-1].setIcon(setIcon(sizeImage,"/bombermanImages/BarrierBlock.png"));
        }

        JLabel label = new JLabel();
        this.add(label);
        
    }
    
    
    
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
        
}
