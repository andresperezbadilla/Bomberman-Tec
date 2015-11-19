/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Hero extends Element{
    GlobalSingleton globals = GlobalSingleton.getGlobalSingleton();
    public Hero() {
        super(1);
    }

    public void moveUp(int posX,int posY) {
       GameLogic gameLogic = globals.getLogic();
       EmptySpace empty = new EmptySpace();
       gameLogic.getLogicMatriz()[posX+1][posY] = empty;
       if(gameLogic.getLogicMatriz()[posX][posY].getCode()==6){
           gameLogic.getLogicMatriz()[posX][posY] = gameLogic.getHero();
       }
       
       
       
       
       
    }
    
    public void moveDown(int posX,int posY){
       GameLogic gameLogic = globals.getLogic();
       EmptySpace empty = new EmptySpace();
       gameLogic.getLogicMatriz()[posX-1][posY] = empty;
       if(gameLogic.getLogicMatriz()[posX][posY].getCode()==6){
       gameLogic.getLogicMatriz()[posX][posY] = gameLogic.getHero();
       }
       
       

       
    }
    
    public void moveRight(int posX,int posY){
       GameLogic gameLogic = globals.getLogic();
       EmptySpace empty = new EmptySpace();
       gameLogic.getLogicMatriz()[posX][posY-1] = empty;
       if(gameLogic.getLogicMatriz()[posX][posY].getCode()==6){
           gameLogic.getLogicMatriz()[posX][posY] = gameLogic.getHero();
       }
       
       
       
        
    }
    
    public void moveLeft(int posX,int posY){
       GameLogic gameLogic = globals.getLogic();
       EmptySpace empty = new EmptySpace();
       gameLogic.getLogicMatriz()[posX][posY+1] = empty;
       if(gameLogic.getLogicMatriz()[posX][posY].getCode()==6){
           gameLogic.getLogicMatriz()[posX][posY] = gameLogic.getHero();
       }
       
       
       
        
    }
    
    
    
    
}
