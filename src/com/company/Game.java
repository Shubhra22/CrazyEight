package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Game
{
    public static Stack<Card> deck = new Stack<Card>();
    List<Player> players;
    int nCardsPerPlayer = 7;
    // Another constructor
    public Game()
    {
        CreateDeck();
        ShuffleDeck();

        players = new ArrayList<Player>();
        players.add(new Player("Hubert"));
        players.add(new Player("Harrison"));

        HandOutCards();
    }

    void CreateDeck()
    {
        for (int i = 2; i <= 14; i++)
        {
            deck.push(new Card(i, Card.Suit.Hearts));
            deck.push(new Card(i, Card.Suit.Clubs));
            deck.push(new Card(i, Card.Suit.Diamonds));
            deck.push(new Card(i, Card.Suit.Spades));
        }
    }

    void ShuffleDeck()
    {
        for(int i =0;i<deck.size();i++)
        {
            int r = Main.rand.nextInt(deck.size());

            Card temp = deck.get(r);
            deck.set(r,deck.get(i));
            deck.set(i,temp);
        }
    }

    void HandOutCards()
    {
        // for each loop
        // read as-> for each player inside players list do.....
        for(Player p : players)
        {
           for(int i =0;i<nCardsPerPlayer;i++)
           {
               Card topCard = deck.pop();
               p.cardInHand.add(topCard);
           }
        }
    }
}
