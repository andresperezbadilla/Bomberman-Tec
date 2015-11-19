/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class GlobalSingleton {
    
    public static GlobalSingleton globals;
    
    
    private JPanel panel;
    private int easyGame;
    private int mediumGame;
    private int difficultGame;
    private int easyImage;
    private int mediumImage;
    private int difficulImage;
    private int easyDestructibleBlock;
    private int mediumDestructibleBlock;
    private int difficultDestructibleBlock;
    private int easyBalloons;
    private int mediumBalloons;
    private int difficultBalloons;
    private int easyBarrels;
    private int mediumBarrels;
    private int difficultBarrels;
    
    
    private GlobalSingleton() {
    }
    
    public static GlobalSingleton getGlobalSingleton(){
        if(globals == null){
            globals = new GlobalSingleton();
            globals.panel = new JPanel();
            globals.easyGame = 15;
            globals.mediumGame = 21;
            globals.difficultGame = 25;
            globals.easyImage = 42;
            globals.mediumImage = 30;
            globals.difficulImage = 25;
            globals.easyDestructibleBlock = 35;
            globals.mediumDestructibleBlock = 75;
            globals.difficultDestructibleBlock = 120;
            globals.easyBalloons = 5;
            globals.mediumBalloons = 8;
            globals.difficultBalloons = 12;
            globals.easyBarrels = 3;
            globals.mediumBarrels = 5;
            globals.difficultBarrels = 10;
            
            
        }
        
        return globals;
    }

   

    public JPanel getPanel() {
        return globals.panel;
    }

    public int getEasyImage() {
        return easyImage;
    }

    public void setEasyImage(int easyImage) {
        this.easyImage = easyImage;
    }

    public int getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(int mediumImage) {
        this.mediumImage = mediumImage;
    }

    public int getDifficulImage() {
        return difficulImage;
    }

    public void setDifficulImage(int difficulImage) {
        this.difficulImage = difficulImage;
    }

    public void setPanel(JPanel panel) {
        globals.panel = panel;
    }

    public int getEasyGame() {
        return globals.easyGame;
    }

    public void setEasyGame(int easyGame) {
        globals.easyGame = easyGame;
    }

    public int getMediumGame() {
        return globals.mediumGame;
    }

    public void setMediumGame(int mediumGame) {
        globals.mediumGame = mediumGame;
    }

    public int getDifficultGame() {
        return globals.difficultGame;
    }

    public void setDifficultGame(int difficultGame) {
        globals.difficultGame = difficultGame;
    }

    public int getEasyDestructibleBlock() {
        return globals.easyDestructibleBlock;
    }

    public void setEasyDestructibleBlock(int easyDestructibleBlock) {
        globals.easyDestructibleBlock = easyDestructibleBlock;
    }

    public int getMediumDestructibleBlock() {
        return globals.mediumDestructibleBlock;
    }

    public void setMediumDestructibleBlock(int mediumDestructibleBlock) {
        globals.mediumDestructibleBlock = mediumDestructibleBlock;
    }

    public int getDifficultDestructibleBlock() {
        return globals.difficultDestructibleBlock;
    }

    public void setDifficultDestructibleBlock(int difficultDestructibleBlock) {
        globals.difficultDestructibleBlock = difficultDestructibleBlock;
    }

    public int getEasyBalloons() {
        return globals.easyBalloons;
    }

    public void setEasyBalloons(int easyBalloons) {
        globals.easyBalloons = easyBalloons;
    }

    public int getMediumBalloons() {
        return globals.mediumBalloons;
    }

    public void setMediumBalloons(int mediumBalloons) {
        globals.mediumBalloons = mediumBalloons;
    }

    public int getDifficultBalloons() {
        return globals.difficultBalloons;
    }

    public void setDifficultBalloons(int difficultBalloons) {
        globals.difficultBalloons = difficultBalloons;
    }

    public int getEasyBarrels() {
        return globals.easyBarrels;
    }

    public void setEasyBarrels(int easyBarrels) {
        globals.easyBarrels = easyBarrels;
    }

    public int getMediumBarrels() {
        return globals.mediumBarrels;
    }

    public void setMediumBarrels(int mediumBarrels) {
        globals.mediumBarrels = mediumBarrels;
    }

    public int getDifficultBarrels() {
        return globals.difficultBarrels;
    }

    public void setDifficultBarrels(int difficultBarrels) {
        globals.difficultBarrels = difficultBarrels;
    }
    
    
    
    
    
    
    
}
