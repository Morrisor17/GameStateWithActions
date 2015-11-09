package edu.up.cs301.homework5dversion3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by morrisor17 on 11/8/2015.
 */
public class SpadesStateTest {

    @Test
    public void testSpadesState() throws Exception{
        SpadesState testState = new SpadesState();
        assertEquals(testState.getCardsPlayed(),0);
        assertEquals(testState.getCurrentPlayer(),0);
        assertEquals(testState.getPlayer1Hand(),0);
        assertEquals(testState.getPlayer2Hand(),0);
        assertEquals(testState.getPlayer3Hand(),0);
        assertEquals(testState.getPlayer4Hand(),0);
        assertEquals(testState.getPlayerBags(),0);
        assertEquals(testState.getPlayerBids(),0);
        assertEquals(testState.getPlayerScore(),0);
        assertEquals(testState.getPlayerTricks(),0);
        assertEquals(testState.getTeam1Score(),0);
        assertEquals(testState.getTeam2Score(),0);
        assertEquals(testState.getTrickCards(),0);
        assertEquals(testState.getUserTeammate(),0);
    }

    @Test
    public void testPlaceBid() throws Exception {
        SpadesState testState = new SpadesState();

        testState.placeBid(5);
        int result = testState.getPlayerBids(0);
        assertEquals(result,5);
    }

    @Test
    public void testPlayCard() throws Exception {

    }
}