package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern chessBoardPattern;

    @Before
    public void setUp() throws Exception {
        chessBoardPattern = new ChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {
        chessBoardPattern = null;
    }

    @Test
    public void inputDataPrintsAPattern(){
        assertEquals("pattern created",chessBoardPattern.patternChessBoard(8,8));
    }

    @Test
    public void inputRowsAndColumnSizeGivesPattern(){
        assertEquals("pattern created",chessBoardPattern.patternChessBoard(7,6));
    }

    @Test
    public void inputDataNotEqualsToOutput(){
        assertNotEquals("pattern not created",chessBoardPattern.patternChessBoard(7,6));
    }

    @Test
    public void inputZeroGivesNull(){
        assertNull(chessBoardPattern.patternChessBoard(0,0));
    }

}