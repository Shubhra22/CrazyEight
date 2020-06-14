package com.company;
import java.util.*;

public class Player
{
    public String name;
    public List<Card> cardInHand = new ArrayList<Card>();

    // create a constructor and initalize the name in the constructor

    // method
    // name same as the class name
    // does not return anything
    public Player(String _name)
    {
        name = _name;
    }

    public void DoTurn()
    {
        System.out.println("Now its "+name+"'s turn");
        System.out.println("Card on pile:");
        System.out.println(Game.pile.peek().GetCardName());
        System.out.println("---------------------------");
    }

    public void DisplayHand()
    {
        for(int i =0;i<cardInHand.size();i++)
        {
            Card c = cardInHand.get(i);
            System.out.println("["+ i +"]"+ c.GetCardName());
        }
    }

    void TryPlayCard(Card c)
    {
        Card topCard = Game.pile.peek();
        boolean canPlay = false;
        if(c.number == 8 || topCard.number == c.number || topCard.suit == c.suit)
        {
            canPlay = true;
        }
        if(canPlay)
        {
            cardInHand.remove(c);
            Game.pile.push(c);
        }
    }


}
