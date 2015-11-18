/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;
import java.util.Random;

/**
 *
 * @author User
 */
public class GameLogic extends Game{
    
    Element [][] logicMatriz;

    public GameLogic(int size, int DestructibleBlock, int balloons, int barrels,int sizeImage) {
        super(size, DestructibleBlock, balloons, barrels,sizeImage);
        logicMatriz = new Element [size][size];
    }

    public void insertBarrierBlock(int size){
    
        BarrierBlock barrier = new BarrierBlock();
        
        for(int x = 0; x < (size);x++){
            logicMatriz [0][x] = barrier;
            logicMatriz [size-1][x] = barrier;
            logicMatriz [x][0] = barrier;
            logicMatriz [x][size-1]= barrier;
        }
        
        for(int x = 0; x < (size);x++){
            for(int y = 0; y < (size);y++){
                if ((x%2==0)&&(y%2==0)){
                    logicMatriz[x][y]= barrier;
                }
            }  
        }
    }
    
    public void insertEmptySpace(int size){
        EmptySpace road = new EmptySpace();
        
        for(int x = 0; x < (size-1);x++){
            for(int y = 0; y < (size-1);y++){
                if((x%2!=0)|| (y%2!=0)){
                    logicMatriz [x][y] = road;
                }               
            }  
        }  
    }
    
    
    public void viewMatriz (){
    
        for(int x = 0; x < (logicMatriz.length);x++){
            for(int y = 0; y < (logicMatriz.length);y++){
                if(logicMatriz[x][y].getCode() == 1){
                    System.out.print("♂");
                }
                else if(logicMatriz[x][y].getCode() == 2){
                    System.out.print("┼");
                        
                }
                else if(logicMatriz[x][y].getCode() == 3){
                    System.out.print("♀");
                }
                
                else if(logicMatriz[x][y].getCode() == 4){
                    System.out.print("▒");
                }               
               if(logicMatriz[x][y].getCode() == 5){
                    System.out.print("♥");
                }
                
                else if(logicMatriz[x][y].getCode() == 6){
                    System.out.print("░");
                }
                
                
            }
            System.out.println("");
        }
    }
    
    public void insertHero(){
        Hero hero = new Hero();
        
        logicMatriz [1][1] = hero;
        
        
    }
    
    public void insertBalloons(int balloons){

        for(int cont = balloons; cont!=0;){
           Random rnd = new Random();
           int posX = rnd.nextInt(super.getSize());
           int posY = rnd.nextInt(super.getSize());
           System.out.println("x:"+posX+"y:"+posY);
           System.out.println(logicMatriz[posX][posY].getCode());
            if(logicMatriz[posX][posY].getCode()==6){
                if((posX==1)&&(posY==2)||(posX==2)&&(posY==1)){
                }
                else{
                Balloons balloon = new Balloons();
                logicMatriz[posX][posY]=balloon;
                cont--;
                }
            }
               
        } 
          
    }
    
    public void insertBarrels(int barrels){

        for(int cont = barrels; cont!=0;){
           Random rnd = new Random();
           int posX = rnd.nextInt(super.getSize());
           int posY = rnd.nextInt(super.getSize());
           System.out.println("x:"+posX+"y:"+posY);
           System.out.println(logicMatriz[posX][posY].getCode());
            if(logicMatriz[posX][posY].getCode()==6){
                if((posX==1)&&(posY==2)||(posX==2)&&(posY==1)){
                }
                else{
                Barrels barrel = new Barrels();
                logicMatriz[posX][posY]=barrel;
                cont--;
                }
            }
               
        } 
          
    }
    
    public void insertDestructibleBlock(int bloks){

        for(int cont = bloks; cont!=0;){
           Random rnd = new Random();
           int posX = rnd.nextInt(super.getSize());
           int posY = rnd.nextInt(super.getSize());
           System.out.println("x:"+posX+"y:"+posY);
           System.out.println(logicMatriz[posX][posY].getCode());
            if(logicMatriz[posX][posY].getCode()==6){
                if((posX==1)&&(posY==2)||(posX==2)&&(posY==1)){
                }
                else{     
                int hidden = rnd.nextInt(3);
                DestructibleBlock block = new DestructibleBlock(hidden);
                logicMatriz[posX][posY]=block;
                cont--;
                    System.out.println("agrege destruible");
                }
            }
               
        } 
          
    }

    public Element[][] getLogicMatriz() {
        return logicMatriz;
    }

    public void setLogicMatriz(Element[][] logicMatriz) {
        this.logicMatriz = logicMatriz;
    }
    
    


}
