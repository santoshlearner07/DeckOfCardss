package com.company;

/**
 * Creating and assigning unique cards to player
 */


public class DeckOfCards {

    void DeckOfCards() {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] deck = new String[52];    // Creating array for 52
        for (int i = 0; i < deck.length; i++) {
            deck[i] = suits[i / 13] + "-" + rank[i % 13];   //  % returns the remainder as 0,1,2,3 / returs 0,0,0 * 13 then 1,1,1 *13

//            System.out.println(deck[i]);
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length); // random value of deck 52
            String temp = deck[i]; // temp stores value in i=0 initially after wards it inc
            deck[i] = deck[index]; // i =0  index = random value 16, 20,50
            deck[index] = temp; // in array format stores the value
//            System.out.println(temp + " ");
        }
        for (String u : deck) { // printing deck gives sorted value , u prints shuffled value
//                System.out.println(u);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println();

            System.out.println("Person-> " + (i + 1));
            System.out.println();

            for (int j = 0; j < 9; j++) {
                System.out.println(deck[j]);
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Game of Cards");

        DeckOfCards cards = new DeckOfCards();  // creating object
        cards.DeckOfCards();

    }
}
