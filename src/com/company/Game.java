package com.company;

import java.util.Stack;

public class Game
{
    public static Stack<Card> deck = new Stack<Card>();

    public Game()
    {
        CreateDeck();
        while (!deck.isEmpty())
        {
            Card d = deck.pop();
            System.out.println(d.GetCardName());
        }

    }

    void CreateDeck() {
        for (int i = 2; i <= 14; i++) {
            deck.push(new Card(i, Card.Suit.Hearts));
            deck.push(new Card(i, Card.Suit.Clubs));
            deck.push(new Card(i, Card.Suit.Diamonds));
            deck.push(new Card(i, Card.Suit.Spades));
        }
    }
}
