package Entities;

import Enums.Suit;

import java.util.Comparator;

public class Card {
    private Integer number;
    private Suit suit;

    public Card(Integer number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

//    public static Comparator<Card> compareCard = new Comparator<Card>() {
//        @Override
//        public int compare(Card o1, Card o2) {
//            return o1.getNumber().compareTo(o2.getNumber());
//        }
//    };

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", suit=" + suit +
                '}';
    }
}
