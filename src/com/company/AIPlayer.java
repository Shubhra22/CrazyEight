package com.company;

public class AIPlayer extends Player
{

    public AIPlayer(String _name) {
        super(_name);
    }

    public void DoTurn()
    {
        super.DoTurn();
        System.out.println("This is AI player turn");
        Main.sc.nextLine();
    }
}
