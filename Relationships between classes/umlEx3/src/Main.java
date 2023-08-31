import Entities.Deck;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createDeck();
        deck.numberOfAvailableCards();
        deck.showDeck();
        System.out.println(deck.getNextCard());
        deck.shuffle();
        deck.showDeck();
        deck.numberOfAvailableCards();

        System.out.println(deck.getCards(2));
        System.out.println(deck.getRemovedCards());
    }
}
