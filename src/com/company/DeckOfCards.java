package com.company;

/**
 * Creating and assigning unique cards to player
 */


public class DeckOfCards {
    public static void main(String[] args) {

        System.out.println("Welcome to Card of Games");

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] deck = new String[52];    // Creating array for 52
        for (int i = 0; i < deck.length; i++) {
            deck[i] = suits[i / 13] + "-" + rank[i % 13];   //  % returns the remainder as 0,1,2,3 / returs 0,0,0 * 13 then 1,1,1 *13

            System.out.println(deck[i]);

        }
    }
}