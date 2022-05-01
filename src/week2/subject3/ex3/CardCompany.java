package week2.subject3.ex3;

public class CardCompany {
    private static int cardNumber = 10000;

    private static CardCompany instance = new CardCompany();
    private CardCompany() {
    }

    public static CardCompany getInstance() {
        if (instance == null)
            instance = new CardCompany();
        return instance;
    }

    public Card createCard() {
        cardNumber++;
        Card card = new Card(cardNumber);
        return card;
    }

    public static int getCardNumber() {
        return cardNumber;
    }
}
