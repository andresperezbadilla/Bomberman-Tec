/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

/**
 *
 * @author User
 */
public class FactoryGame implements CreateGame{

    @Override
    public Game createGame(int size, int DestructibleBlock, int Balloons, int Barrels,int sizeImage,int power) {
        if(size == 15){
            Game game = new Game(size, DestructibleBlock, Balloons, Barrels, sizeImage, power);
            return  game;
               
        }
        
        else if(size == 21){
            Game game = new Game(size, DestructibleBlock, Balloons, Barrels, sizeImage, power);
            return  game;
            
        }
        
        else if(size == 25){
            Game game = new Game(size, DestructibleBlock, Balloons, Barrels, sizeImage, power);
            return  game;
            
        }
        return null;
    }
    
    
}
