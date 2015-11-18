/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman.Logic;

/**
 *
 * @author User
 */
public class GameLogic extends Game{
    
    Element [][] logic;

    public GameLogic(Element[][] logic, int size, int DestructibleBlock, int balloons, int barrels,int sizeImage) {
        super(size, DestructibleBlock, balloons, barrels,sizeImage);
        this.logic = logic;
    }
    
    
    
    public void fillMatrix(int size){
        
        logic = new Element [size][size];
        
        
        
        
    }
    
    
    
}
