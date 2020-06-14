package com.company;

public class HumanPlayer extends Player
{
    public HumanPlayer(String _name)
    {
        super(_name);
        System.out.println("This is Player's turn");
        Main.sc.nextLine();
    }

    void PickCard()
    {
        // exception Handling
        try
        {
            int i = Main.sc.nextInt();
            Card c = cardInHand.get(i);
            TryPlayCard(c);
        }

        catch (Exception e)
        {
            PickCard();
        }

    }
}
