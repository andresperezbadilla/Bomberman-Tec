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
public class GameGraphic extends Game {
    
    Element [][] graphicMatrix;
    GlobalSingleton globals = GlobalSingleton.getGlobalSingleton();

    public GameGraphic(Element[][] graphicMatrix, int size, int DestructibleBlock, int balloons, int barrels, int sizeImage) {
        super(size, DestructibleBlock, balloons, barrels, sizeImage);
        this.graphicMatrix = graphicMatrix;
    }

    
    
    
    
    
}
