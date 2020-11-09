

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WordAnalyserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WordAnalyserTest
{
    /**
     * Default constructor for test class WordAnalyserTest
     */
    public WordAnalyserTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFollowedBy()
    {
        WordAnalyser wordAnal2 = new WordAnalyser();
        wordAnal2.addWord("one");
        wordAnal2.addWord("two");
        assertEquals(true, wordAnal2.followedBy("one", "two"));
    }

    @Test
    public void testAddWord()
    {
        WordAnalyser wordAnal1 = new WordAnalyser();        
        wordAnal1.addWord("one");
        wordAnal1.addWord("two");
        wordAnal1.addWord("three");
        wordAnal1.addWord("four");
        wordAnal1.addWord("five");
    }

    @Test
    public void testGetCount()
    {
        WordAnalyser wordAnal1 = new WordAnalyser();
        wordAnal1.addWord("one");
        wordAnal1.addWord("one");
        wordAnal1.addWord("one");
        wordAnal1.addWord("two");
        wordAnal1.addWord("three");
        wordAnal1.addWord("three");
        wordAnal1.addWord("four");
        wordAnal1.addWord("five");        
        assertEquals(3, wordAnal1.getCount("one"));
    }

    @Test
    public void testGetCaseInsensitiveCount()
    {
        WordAnalyser wordAnal1 = new WordAnalyser();
        wordAnal1.addWord("one");
        wordAnal1.addWord("One");
        wordAnal1.addWord("ONE");
        wordAnal1.addWord("two");
        wordAnal1.addWord("three");
        assertEquals(3, wordAnal1.getCaseInsensitiveCount("one"));
    }
}




