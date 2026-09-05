package org.example.game;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import org.example.cards.Card;
import org.example.deck.Deck;
import org.example.hand.Hand;

public class DealCards {

    public void deal() {
        List<Card> deck = Deck.createDeck();
        Collections.shuffle(deck);
        List<Card> playerCards = deck.stream().limit(2).collect(Collectors.toList());
        List<Card> dealerCards = deck.stream().skip(2).limit(2).collect(Collectors.toList());

        Hand playerHand = new Hand(playerCards);
        Hand dealerHand = new Hand(dealerCards);

        System.out.println("Player's hand: " + playerHand.getCards());
        System.out.println("Dealer's hand: " + dealerHand.getCards());
    }   // <-- closes deal()
}       // <-- closes DealCards