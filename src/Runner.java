//Alexander Cox
//Tuesday, December 11, 2018

import javax.lang.model.type.DeclaredType;

public class Runner {

    public static void main (String[] args)
    {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"D", "C", "H", "S"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        Deck deck = new Deck(ranks, suits, values);

        System.out.println("Un-shuffled:");
        System.out.println(deck);

        deck.shuffle();

        System.out.println("Shuffled:");
        System.out.println(deck);

        System.out.println("Deal 10:");

        for (int i = 0; i < 10; i++)
        {
            System.out.println(deck.deal());
        }

        System.out.print("\n");

        System.out.println(deck);
    }
}
