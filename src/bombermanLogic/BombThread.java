/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import bombermanSound.Sounds;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class BombThread extends Thread{

    public BombThread() {
    }
    GlobalSingleton globals = GlobalSingleton.getGlobalSingleton();
    GameLogic game = globals.getLogic();
    GameGraphic matrix = globals.getGraphic();
    Sounds sound = new Sounds();
    EmptySpace empty = new EmptySpace();
    int boomX = matrix.bomX;
    int boomY = matrix.bomY;
    int mosters = (game.getBalloons()+game.getBarrels());
    
    @Override
    public void run(){
        
        try {
            
            Thread.sleep(2900);
            sound.bomb();
            game.getLogicMatriz()[boomY][boomX]=empty;
            
            matrix.getMatrix()[boomY][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            
            //destroid up power 
            if(game.getLogicMatriz()[boomY-1][boomX].getCode()==11){
                
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Power.png"));
                
                //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //destrid down power
            if(game.getLogicMatriz()[boomY+1][boomX].getCode()==11){
               
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Power.png"));
                
                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //distroid right power
            if(game.getLogicMatriz()[boomY][boomX+1].getCode()==11){
                
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Power.png"));
                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //distroid leftvpower
            if((game.getLogicMatriz()[boomY][boomX-1].getCode()==11)){
                
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Power.png"));
                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            } 
            
            //destroid up door 
            if(game.getLogicMatriz()[boomY-1][boomX].getCode()==10){
                
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Door.png"));
                
                //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //destrid down door
            if(game.getLogicMatriz()[boomY+1][boomX].getCode()==10){
               
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Door.png"));
                
                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
             //distroid right door
            if(game.getLogicMatriz()[boomY][boomX+1].getCode()==10){
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
               
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Door.png"));
               
                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //distroid left door
            if(game.getLogicMatriz()[boomY][boomX-1].getCode()==10){
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
               
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/Door.png"));
                
                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            
            
            //destroid up
            if((game.getLogicMatriz()[boomY-1][boomX].getCode()==5)||(game.getLogicMatriz()[boomY-1][boomX].getCode()==6)){
                game.getLogicMatriz()[boomY-1][boomX]=empty;
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //destrid down
            if((game.getLogicMatriz()[boomY+1][boomX].getCode()==5||game.getLogicMatriz()[boomY+1][boomX].getCode()==6)){
                game.getLogicMatriz()[boomY+1][boomX]=empty;
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                
                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //distroid right
            if((game.getLogicMatriz()[boomY][boomX+1].getCode()==5)||(game.getLogicMatriz()[boomY][boomX+1].getCode()==6)){
                game.getLogicMatriz()[boomY][boomX+1]=empty;
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
               
                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //distroid left
            if((game.getLogicMatriz()[boomY][boomX-1].getCode()==5)||(game.getLogicMatriz()[boomY][boomX-1].getCode()==6)){
                game.getLogicMatriz()[boomY][boomX-1]=empty;
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
                
                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //destroid up mosters
            if((game.getLogicMatriz()[boomY-1][boomX].getCode()==2)||(game.getLogicMatriz()[boomY-1][boomX].getCode()==3)){
                game.getLogicMatriz()[boomY-1][boomX]=empty;
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                mosters--;
                //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //destrid down mosters
            if((game.getLogicMatriz()[boomY+1][boomX].getCode()==2)||(game.getLogicMatriz()[boomY+1][boomX].getCode()==3)){
                game.getLogicMatriz()[boomY+1][boomX]=empty;
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/VerticalExplosion.png"));
                mosters--;
                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //distroid right mosters
            if((game.getLogicMatriz()[boomY][boomX+1].getCode()==2)||(game.getLogicMatriz()[boomY][boomX+1].getCode()==3)){
                game.getLogicMatriz()[boomY][boomX+1]=empty;
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
                mosters--;
                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //distroid left monsters
            if((game.getLogicMatriz()[boomY][boomX-1].getCode()==2)||(game.getLogicMatriz()[boomY][boomX-1].getCode()==3)){
                game.getLogicMatriz()[boomY][boomX-1]=empty;
                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/HorizontalExplosion.png"));
                mosters--;
                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            Thread.sleep(100);
            //cleaan up
            if((game.getLogicMatriz()[boomY-1][boomX].getCode()==5)||(game.getLogicMatriz()[boomY-1][boomX].getCode()==6)){
               
                matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            
            //clean down
            if((game.getLogicMatriz()[boomY+1][boomX].getCode()==5||game.getLogicMatriz()[boomY+1][boomX].getCode()==6)){
                
                matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //clean right
            if((game.getLogicMatriz()[boomY][boomX+1].getCode()==5)||(game.getLogicMatriz()[boomY][boomX+1].getCode()==6)){
                
                matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            //clean left
            if((game.getLogicMatriz()[boomY][boomX-1].getCode()==5)||(game.getLogicMatriz()[boomY][boomX-1].getCode()==6)){

                matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
            }
            Thread.sleep(100);
            
            
        } catch (Exception e) {
        }

       
    }
    
    public ImageIcon setIcon(int scale,String direction){
    URL url = getClass().getResource(direction);
    ImageIcon icon = new ImageIcon(url);
    ImageIcon tempIcon = new ImageIcon(icon.getImage().getScaledInstance(scale, -1, Image.SCALE_DEFAULT));
    return tempIcon;
    }
    
}
