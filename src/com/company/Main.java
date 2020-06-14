package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static Random rand;
    public static Scanner sc;

    public static HashMap<Integer,String>  cardId_name;
    public static void main(String[] args)
    {

        sc = new Scanner(System.in);
        rand = new Random();
        cardId_name = new HashMap<Integer, String>();
        cardId_name.put(2,"2");
        cardId_name.put(3,"3");
        cardId_name.put(4,"4");
        cardId_name.put(5,"5");
        cardId_name.put(6,"6");
        cardId_name.put(7,"7");
        cardId_name.put(8,"8");
        cardId_name.put(9,"9");
        cardId_name.put(10,"10");
        cardId_name.put(11,"Jack");
        cardId_name.put(12,"Queen");
        cardId_name.put(13,"King");
        cardId_name.put(14,"Ace");

        Game g = new Game();
    }
}
