package creditCard;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Card {


    public void display(Long number) {
        String cradName = getCard(number);
        check(cradName);
    }

    public String getCard(Long number) {
        List<CreditCard> cards = Creditcards.getCards();
        String creditCard = "";
        for (CreditCard card : cards) {
            Integer spacialNumber = getSpacialNumber(number);
            Integer lenght = getLenght(number);
            if (card.checkIsValue(lenght, spacialNumber)) {
                creditCard = card.getName();
                return creditCard;
            }
        }

        return creditCard;
    }


    private void check(String name) {

        Optional<CreditCard> cards = getOpitional(name);
        if (cards.isPresent()) {
            System.out.println("The card is " + cards.get().getName());
        } else
            System.out.println(name + " card is Invalid");
    }

    public Optional<CreditCard> getOpitional(String name) {
        List<CreditCard> cards = Creditcards.getCards();

        for (CreditCard card : cards) {
            if (card.getName().equalsIgnoreCase(name)) {
                return Optional.of(card);
            }
        }
        return Optional.empty();
    }


    public Integer getSpacialNumber(Long number) {

        String numberString = number.toString(number);
        Integer spacialNumber = 0;
        if (numberString.startsWith("4")) {
            spacialNumber = 4;

        } else {
            List<String> numbersList = getSplintList(numberString);
            String numEmpty = "";
            for (int i = 0; i < 2; i++) {
                String numString = numbersList.get(i);
                numEmpty = numEmpty + numString;
            }
            spacialNumber = Integer.valueOf(numEmpty);
            return spacialNumber;

        }
        return spacialNumber;
    }


    public Integer getLenght(Long number) {
        String numberString = number.toString(number);
        List<String> numbers = getSplintList(numberString);
        return numbers.size();
    }

    public List<String> getSplintList(String number) {
        String[] splint = number.split("");
        List<String> allnumbers = Arrays.asList(splint);
        return allnumbers;
    }

}
