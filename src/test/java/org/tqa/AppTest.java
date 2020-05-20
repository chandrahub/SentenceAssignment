package org.tqa;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Sentence App.
 */
public class AppTest 
{
    @Test
    public void getLongestWordTest()
    {
        App app = new App("The cow jumped over the moon.");
        assertEquals(app.longestWord(), "jumped");
    }

    @Test
    public void getShortestWordTest()
    {
        App app = new App("The cow jumped over the moon.");
        assertEquals(app.shortestWord(), "The");
    }

    @Test
    public void getShortestWordLengthTest()
    {
        App app = new App("The cow jumped over the moon.");
        assertEquals(app.getShortestWordLength(), 3);
    }

    @Test
    public void getLongestWordLengthTest()
    {
        App app = new App("The cow jumped over the moon.");
        assertEquals(app.getLongestWordLength(), 6);
    }
}
