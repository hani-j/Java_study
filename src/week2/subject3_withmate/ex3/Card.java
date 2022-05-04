package week2.subject3_withmate.ex3;

public class Card {
    static int cardSerialNumber = 10000;
    int cardNumber;

    public Card() {
        cardNumber = ++cardSerialNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
