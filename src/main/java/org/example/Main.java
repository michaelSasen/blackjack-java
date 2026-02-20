package org.example;

import org.example.cards.Card;
import org.example.deck.Deck;

import java.util.List;

public class Main {
    static void main() {

        List<Card> deck = Deck.createDeck();
        deck.forEach(System.out::println);

        }
    }
