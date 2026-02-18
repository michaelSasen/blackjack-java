package org.example.deck;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.example.cards.Card;
import org.example.cards.Rank;
import org.example.cards.Suit;

public class Deck {
    public static  List<Card> createDeck() {
        return Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Rank.values())
                        .map( rank -> new Card(suit, rank)))
                .collect(Collectors.toList());

    }

}
