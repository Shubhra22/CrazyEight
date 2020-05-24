package com.company;

public class Card
{
    // create a varibale of type int named as number
    private int number;
    // create an enum with four different kinds of card name
    // Hearts, Diamonds, Spades, Clubs
    public enum Suit
    {
        Hearts,
        Diamonds,
        Spades,
        Clubs
    }

    public Suit suit;

    // This is a Constructor.
    Card(int number, Suit suit)
    {
        this.number = number;
        this.suit = suit;
    }

    public String GetCardName()
    {
        return Main.cardId_name.get(number) + "of" + suit;
    }
}
