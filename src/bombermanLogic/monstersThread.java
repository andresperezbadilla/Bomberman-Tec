/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class monstersThread extends Thread{

    public monstersThread() {
    }
    
    GlobalSingleton globals = GlobalSingleton.getGlobalSingleton();
    
    
   
    Random rnd = new Random();
    EmptySpace empty = new EmptySpace();
    Balloons ballon = new Balloons();
    Barrels barrel = new Barrels();
    boolean mov = true;
    @Override
    public void run(){
    
        try {
            while(true){
                for(int y =0;y<globals.getLogic().getSize();y++){
                    for(int x =0;x<globals.getLogic().getSize();x++){
                        
                        
                        if(globals.getLogic().getLogicMatriz()[y][x].getCode()==2){
                            int dir = rnd.nextInt(4);
                            //move up
                            if((globals.getLogic().getLogicMatriz()[y-1][x].getCode()==6)&&(dir==0)){
                                
                                globals.getLogic().getLogicMatriz()[y-1][x]=ballon;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y-1][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Balloons.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));    
                            //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                           //move down
                            if((globals.getLogic().getLogicMatriz()[y+1][x].getCode()==6)&&(dir==1)){
                                globals.getLogic().getLogicMatriz()[y+1][x]=ballon;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y+1][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Balloons.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                            //move rigth
                            if((globals.getLogic().getLogicMatriz()[y][x+1].getCode()==6)&&(dir==2)){
                                globals.getLogic().getLogicMatriz()[y][x+1]=ballon;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y][x+1].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Balloons.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                            //move left
                            if((globals.getLogic().getLogicMatriz()[y][x-1].getCode()==6)&&(dir==3)){
                                globals.getLogic().getLogicMatriz()[y][x-1]=ballon;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y][x-1].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Balloons.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            } 
                            
                            

                            }
                        
                        if(globals.getLogic().getLogicMatriz()[y][x].getCode()==3){
                            int dir = rnd.nextInt(4);
                            //move up
                            if((globals.getLogic().getLogicMatriz()[y-1][x].getCode()==6)&&(dir==0)){
                                
                                globals.getLogic().getLogicMatriz()[y-1][x]=barrel;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y-1][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Barrels.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));    
                            //matrix.getMatrix()[boomY-1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                           //move down
                            if((globals.getLogic().getLogicMatriz()[y+1][x].getCode()==6)&&(dir==1)){
                                globals.getLogic().getLogicMatriz()[y+1][x]=barrel;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y+1][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Barrels.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY+1][boomX].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                            //move rigth
                            if((globals.getLogic().getLogicMatriz()[y][x+1].getCode()==6)&&(dir==2)){
                                globals.getLogic().getLogicMatriz()[y][x+1]=barrel;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y][x+1].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Barrels.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY][boomX+1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            }
                            //move left
                            if((globals.getLogic().getLogicMatriz()[y][x-1].getCode()==6)&&(dir==3)){
                                globals.getLogic().getLogicMatriz()[y][x-1]=barrel;
                                globals.getLogic().getLogicMatriz()[y][x]=empty;
                                globals.getGraphic().getMatrix()[y][x-1].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/Barrels.png"));
                                globals.getGraphic().getMatrix()[y][x].setIcon(setIcon(globals.getLogic().getSizeImage(),"/bombermanImages/EmptySpace.png"));  
                                //matrix.getMatrix()[boomY][boomX-1].setIcon(setIcon(game.getSizeImage(),"/bombermanImages/EmptySpace.png"));
                            } 
                            
                            

                            }
                       

                    }
                }
            Thread.sleep(1000);   
            }
            
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
