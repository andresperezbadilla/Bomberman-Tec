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
    public Game createGame(int size, int DestructibleBlock, int Balloons, int Barrels,int sizeImage) {
        if(size == 15){
            GameLogic game = new GameLogic(size,DestructibleBlock,Balloons,Barrels,sizeImage);
            game.insertEmptySpace(game.getSize());
            game.insertBarrierBlock(game.getSize());
            game.insertHero();
            game.insertDestructibleBlock(game.getDestructibleBlock());
            game.insertBalloons(game.getBalloons());
            game.insertBarrels(game.getBarrels());
            game.viewMatriz();
            game.getLogicMatriz();
            return game;
        }
        
        else if(size == 21){
            GameLogic game = new GameLogic(size,DestructibleBlock,Balloons,Barrels,sizeImage);
            game.insertEmptySpace(game.getSize());
            game.insertBarrierBlock(game.getSize());
            game.insertBalloons(game.getBalloons());
            game.insertBarrels(game.getBarrels());
            game.insertHero();
            game.insertDestructibleBlock(game.getDestructibleBlock());
            game.viewMatriz();
            return game;
        }
        
        else if(size == 25){
            GameLogic game = new GameLogic(size,DestructibleBlock,Balloons,Barrels,sizeImage);
            game.insertEmptySpace(game.getSize());
            game.insertBarrierBlock(game.getSize());
            game.insertBalloons(game.getBalloons());
            game.insertBarrels(game.getBarrels());
            game.insertHero();
            game.insertDestructibleBlock(game.getDestructibleBlock());
            
            game.viewMatriz();
            return game;
        }
        return null;
    }
    
    
}
