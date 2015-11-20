/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import bombermanGraphic.StartGame;
import bombermanSound.Sounds;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Game {
    GlobalSingleton globals = GlobalSingleton.getGlobalSingleton();

    private int size;
    private int DestructibleBlock;
    private int balloons;
    private int barrels;
    private int sizeImage;
    private int power;
    GameLogic gameLogic;
    GameGraphic gameGraphic;
    Sounds sound = new Sounds();
    
    
    

    public Game(int size, int DestructibleBlock, int balloons, int barrels,int sizeImage,int power) {
        this.size = size;
        this.DestructibleBlock = DestructibleBlock;
        this.balloons = balloons;
        this.barrels = barrels;
        this.sizeImage = sizeImage;
        this.power = power;
        gameLogic = new GameLogic(size, DestructibleBlock, balloons, barrels, sizeImage, power);
        gameLogic.insertEmptySpace(gameLogic.getSize());
        gameLogic.insertBarrierBlock(gameLogic.getSize());
        gameLogic.insertHero();
        gameLogic.insertDestructibleBlock(gameLogic.getDestructibleBlock(),gameLogic.getPower());
        gameLogic.insertBalloons(gameLogic.getBalloons());
        gameLogic.insertBarrels(gameLogic.getBarrels());
        globals.setLogic(gameLogic);
        gameLogic.viewMatriz();
        gameGraphic = new GameGraphic(gameLogic);
        globals.setGraphic(gameGraphic);
        gameGraphic.setSize(647,669);
        sound.gaming();
        gameGraphic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameGraphic.setTitle("Bomberman");
        //gameGraphic.setIconImage(new ImageIcon(getClass().getResource("/Images/Bomb.png")).getImage());
        gameGraphic.setLocationRelativeTo(null);
        gameGraphic.setVisible(true);
        
        
        
                
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDestructibleBlock() {
        return DestructibleBlock;
    }

    public void setDestructibleBlock(int DestructibleBlock) {
        this.DestructibleBlock = DestructibleBlock;
    }

    public int getBalloons() {
        return balloons;
    }

    public void setBalloons(int balloons) {
        this.balloons = balloons;
    }

    public int getBarrels() {
        return barrels;
    }

    public void setBarrels(int barrels) {
        this.barrels = barrels;
    }

    public int getSizeImage() {
        return sizeImage;
    }

    public void setSizeImage(int sizeImage) {
        this.sizeImage = sizeImage;
    }
    
    
    
    
    
    
}
