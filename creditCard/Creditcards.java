package creditCard;

import java.util.Arrays;
import java.util.List;

public class Creditcards {

    private static List<CreditCard> cards = Arrays.asList(new MasterCard(), new Visa(), new AmericanExpress());

    public static List<CreditCard> getCards() {
        return cards;
    }
}
