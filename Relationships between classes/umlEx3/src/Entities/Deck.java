package Entities;

import Enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final ArrayList<Card> deck;
    private final ArrayList<Card> cardsRemovedFromDeck;

    public Deck() {
        deck = new ArrayList<Card>();
        cardsRemovedFromDeck = new ArrayList<Card>();
    }

    public void createDeck() {

        for (Suit suit : Suit.values()) {
            for (int i = 1; i < 11; i++) {
                deck.add(new Card(i, suit));
            }
        }

    }

    public void showDeck() {
        System.out.println();
        deck.forEach(System.out::println);
        System.out.println();
    }

    public void shuffle() {
        System.out.println();
        Collections.shuffle(deck);
        System.out.println();
    }

    public Card getNextCard(){
        if (deck.size() == 0) {
            return null;
        }

        Card removedCard = deck.remove(deck.size() - 1);
        cardsRemovedFromDeck.add(removedCard);

        return removedCard;
    }

    public void numberOfAvailableCards(){
        System.out.println(deck.size());
    }

    public ArrayList<Card> getCards(int amount) {
        if (amount > deck.size() - 1) {
            return null;
        }

        List<Card> subList = deck.subList(deck.size() - amount, deck.size());
        return new ArrayList<>(subList);
    }

    public ArrayList<Card> getRemovedCards() {
        if (cardsRemovedFromDeck.size() == 0) {
            return null;
        }

        return cardsRemovedFromDeck;
    }
}
