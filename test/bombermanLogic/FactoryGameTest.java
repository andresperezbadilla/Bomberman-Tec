/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class FactoryGameTest {
    
    public FactoryGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createGame method, of class FactoryGame.
     */
    @Test
    public void testCreateGame() {
        System.out.println("createGame");
        int size = 0;
        int DestructibleBlock = 0;
        int Balloons = 0;
        int Barrels = 0;
        int sizeImage = 0;
        int power = 0;
        FactoryGame instance = new FactoryGame();
        Game expResult = null;
        Game result = instance.createGame(size, DestructibleBlock, Balloons, Barrels, sizeImage, power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
