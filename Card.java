/**
 * This class represents a playing card.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card 
{
    private String rank;
    private String suit;
    private int value;

   /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>String</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>String</code> value
     *                  containing the suit of the card
     * @param cardValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardValue) 
    {
        rank = cardRank;
        suit = cardSuit;
        value = cardValue;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String getRank() 
    {
        return rank;    // replace this line
    }

    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String getSuit() 
    {
        return suit;    // replace this line
   }

   /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int getValue() 
    {
        return value;      //replace this line
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean equals(Card other) 
    {
        return this.rank.equals(other.getRank()) && this.suit.equals(other.getSuit()) && this.value == other.getValue();   // replace this line
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (value = [Value])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() 
    {
        return rank + " of " + suit + " (value = " + value + ")";
    }
}
