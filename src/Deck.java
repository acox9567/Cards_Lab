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


    public Card deal()
    {
        if (isEmpty())
            return null;

        Card card = unDealt.remove((unDealt.size() - 1));

        Dealt.add(card);

        return card;
    }


    public void shuffle()
    {
        unDealt.add(Dealt.remove(0));

        for (int k = 51; k >= 1; k--)
        {
            int rand = (int)(Math.random() * k);

            Card placeHolder = unDealt.get(k);
            unDealt.set(k, unDealt.get(rand));
            unDealt.set(rand, placeHolder);
        }
    }

    public String toString()
    {
        String str = "Dealt cards: [";

        for (int i = 0; i < Dealt.size(); i++)
        {
            str += Dealt.get(i);
        }

        str = str.substring(0, str.length() - 2);
        str += "]\nUndealt card: ";

        for (int i = 0; i < unDealt.size(); i++)
        {
            str += unDealt.get(i);
        }

        str = str.substring(0, str.length() - 2);
        str += "]";

        return str;
    }
}
