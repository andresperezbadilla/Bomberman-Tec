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
public abstract class MobileElements extends Element{

    public MobileElements(int code) {
        super(code);
    }

   
    public abstract int move();
    
}
