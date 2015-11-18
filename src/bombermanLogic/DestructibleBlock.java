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
public class DestructibleBlock extends Element{
    
    private int hidden;

    public DestructibleBlock(int hidden) {
        super(5);
        this.hidden = hidden;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }
    
    
    
}
