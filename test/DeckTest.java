/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Saranjeet
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createFullDeck method, of class Deck.
     */
    @Test
    public void testCreateFullDeck() {
        System.out.println("createFullDeck");
        Deck instance = new Deck();
        instance.createFullDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Deck.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        int i = 0;
        Deck instance = new Deck();
        instance.removeCard(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int i = 0;
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.getCard(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Deck.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card addCard = null;
        Deck instance = new Deck();
        instance.addCard(addCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck comingFrom = null;
        Deck instance = new Deck();
        instance.draw(comingFrom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveAllToDeck method, of class Deck.
     */
    @Test
    public void testMoveAllToDeck() {
        System.out.println("moveAllToDeck");
        Deck moveTo = null;
        Deck instance = new Deck();
        instance.moveAllToDeck(moveTo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deckSize method, of class Deck.
     */
    @Test
    public void testDeckSize() {
        System.out.println("deckSize");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.deckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardsValue method, of class Deck.
     */
    @Test
    public void testCardsValue() {
        System.out.println("cardsValue");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.cardsValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
