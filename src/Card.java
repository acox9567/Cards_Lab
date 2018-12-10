//Alexander Cox
//Monday, December 10, 2018

public class Card {

    String rank;
    String suit;
    int pointValue;

    public Card (String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if(this.pointValue == otherCard.pointValue)
            return true;

        return false;
    }

    public String toString()
    {
        return (rank + "of" + suit);
    }

    public String getRank()
    {
        return this.rank;
    }
    public String getSuit()
    {
        return this.rank;
    }
    public String pointValue()
    {
        return this.rank;
    }
}
