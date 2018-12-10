//Alexander Cox
//Monday, December 10, 2018

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck (String[] ranks, String[] suits, int[] pointValues)
    {
        for (int i = 0; i < ranks.length; i++)
        {
            for (int j = 0; j < suits.length; i++)
            {
                Card newCard = new Card(ranks[i], suits[j], pointValues[i]);
                unDealt.add(newCard);
            }
        }
    }

    public boolean isEmpty()
    {
        if (unDealt.size() <= 0)
            return true;

        return false;
    }

    public int size()
    {
        return unDealt.size();
    }
}
