package org.example.hand;
import org.example.cards.Card;
import org.example.cards.Rank;

import java.util.Collections;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        // Make sure it is read only.
        return Collections.unmodifiableList(cards);
    }

    public int getTotalValue() {
        // Sum every card values from the stream
        int totalSum = cards.stream()
                .mapToInt(card -> card.rank().value())
                .sum();

        long aces = cards.stream()
                .filter(card -> card.rank() == Rank.ACE)
                .count();

        return adjustedForAces(totalSum, (int) aces);
    }

    private int adjustedForAces(int totalSum, int aces) {
        if(totalSum >= 21 || aces == 0){
            return totalSum;
        }

        // Make it return 1 instead of 11
        return adjustedForAces(totalSum, aces - 10);
    }
}
