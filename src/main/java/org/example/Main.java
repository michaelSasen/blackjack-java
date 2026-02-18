package org.example;

import org.example.cards.Card;
import org.example.deck.Deck;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        List<Card> deck = Deck.createDeck();
        deck.forEach(System.out::println);

        }
    }
