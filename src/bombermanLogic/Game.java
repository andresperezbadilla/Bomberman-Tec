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
public class Game {
    
    private int size;
    private int DestructibleBlock;
    private int balloons;
    private int barrels;
    private int sizeImage;

    public Game(int size, int DestructibleBlock, int balloons, int barrels,int sizeImage) {
        this.size = size;
        this.DestructibleBlock = DestructibleBlock;
        this.balloons = balloons;
        this.barrels = barrels;
        this.sizeImage = sizeImage;
                
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
