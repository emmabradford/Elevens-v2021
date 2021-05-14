/**
 * This class provides a convenient way to test shuffling methods.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuffler 
{
    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static int[] perfectShuffle(int[] values) 
    {
        int[] shuffled = new int[values.length];
        
        int k = 0;
        for(int j = 0; j <= values.length / 2-1; j++)
        {
            shuffled[k] = values[j];
            k = k + 2;
        }
        k = 1;
        for(int j = values.length / 2; j < values.length; j++)
        {
            shuffled[k] = values[j];
            k = k + 2;
        }
        return shuffled;    // replace this line
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm begins by exchanging the last element
     * in the array with randomly selected element preceeding it, and then 
     * exchanging the second-to-the-last element with another randomly 
     * selected element preceeding it.  The selection thus continues from 
     * the back to the front with random elements selected from those 
     * preceeding it.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) 
    {
        for(int k = values.length - 1; k >= 1; k--)
        {
            int ran = (int)(Math.random() * k);
            int temp = values[k];
            values[k] = values[ran];
            values[ran] = temp;
        }
        
    }
}
