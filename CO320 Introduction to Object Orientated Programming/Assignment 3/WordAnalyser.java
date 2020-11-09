import java.util.ArrayList;

/**
 * Keep track of word counts and word pairs.
 *
 * @Dylan Danga Dje Oleko (dd404)
 */
public class WordAnalyser
{    
    private ArrayList<String> analyzer;
    //Declaring the ArrayList called analyzer.

    /**
     * Constructor for objects of class WordAnalyser
     */
    public WordAnalyser()
    {
        analyzer = new ArrayList<>();
        //Initlises the new ArrayList called analyzer.
    }

    /**
     * Add a word to the analyser.
     * @param word the word to be added.
     */
    public void addWord(String word)
    {
        analyzer.add(word);
        //Allows us to add a word to the ArrayList e.g. "boss".
    }

    /**
     * Get the number of times the given word has been seen.
     * @param word The word to be looked up.
     * @return The number of times the word has been seen.
     */
    public int getCount(String word)
    {
        int count = 0;
        for(String analyzed : analyzer)
        //For loop is used to iterate through the ArrayList.
        {
            if(analyzed.equals(word))
            {
                count++;
                //If the word is detected the count increases by one.
            }
        }
        return count;
        //Returns the number of times a specific word occurs.
    }

    /**
     * Return true if firstWord has been immediately
     * followed by secondWord; false otherwise.
     * @param firstWord
     * @param secondWord
     */
    public boolean followedBy(String firstWord, String secondWord)
    {        
            for(int index = 0; index <= analyzer.size()-2; index++)
            //You go onto the second word to avoid a point of exception/error.
            {
                String analyzed = analyzer.get(index);
                //analyzer.get(index) is assigned to the String variable analyzed.
                String nextWordInList = analyzer.get(index+1);
                //analyzer.get(index+1) is the secondWord/the word after...the index
                //analyzer.get(index+1) is assigned to the String variable nextWordInList.
                if(firstWord.equals(analyzed) && secondWord.equals(nextWordInList))
                {
                    return true;
                    //If the the second word follows the first word true is returned if not false is returned.
                }
            }
            return false;
    }

    /**
     * Get the number of times the given word has been seen,
     * regardless of the case of its occurrences.
     * @param word The word to be looked up.
     * @return The number of times the word has been seen.
     */
    public int getCaseInsensitiveCount(String word)
    {
        int count = 0;
        for(String analyzed : analyzer)
        //For loop is used to iterate through the ArrayList.
        {
            if(analyzed.equalsIgnoreCase(word)){
                count++;
                //If the word is detected the index increases by one.
            }
        }
        return count;
        //The count (index) is returned signifying the number of times the word occurs regardless of upper or lower case.
    }
}
