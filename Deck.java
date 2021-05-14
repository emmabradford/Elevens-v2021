/**
 * This class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Deck 
{

    private Card[] cards;
    private int size;   // represents the number of undelt cards

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) 
    {
        size = ranks.length*suits.length;
        cards = new Card[size];
        int count =0;
        for(int i = 0; i < suits.length; i++)
        {
            for(int b = 0; b < ranks.length; b++)
            {
                Card c = new Card(ranks[b], suits[i], values[b]);
                cards[count] = c;
                count++;
            }
        }
        shuffle();
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int getSize() 
    {
        return size;      // replace this line
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() 
    {
        return size == 0;   // replace this line
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() 
    {   
       for(int k = cards.length - 1; k >= 1; k--)
        {
            int ran = (int)(Math.random() * k);
            Card temp = cards[k];
            cards[k] = cards[ran];
            cards[ran] = temp;
        } 
        size = cards.length;
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() 
    {   
        if(isEmpty())
        {
            return null;
        }    // replace this line
        else
        {
            size--;
            return cards[size];
        }
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards[k];
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.length - 1; k >= size; k--) {
            rtn = rtn + cards[k];
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.length) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }
        rtn = rtn + "\n";
        return rtn;
    }
}
