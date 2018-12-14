package creditCard;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Card {


    private List<CreditCard> cards = Arrays.asList(new MasterCard(), new Visa(), new AmericanExpress());

    public Optional<List<CreditCard>> getCards () {
        return Optional.of(cards);
    }

    public String getCard(Long number) {
        String creditCard = "";
        for (CreditCard card : cards) {
            Integer spacialNumber = getSpacialNumber(number);
            Integer lenght = getLenght(number);
            if (card.checkIsValue(lenght, spacialNumber)) {
                 creditCard = card.getName();
                return creditCard;
            }else {
                creditCard = " Creditcard is Invalid";

            }
        }

        return creditCard;
    }
    public  Optional<CreditCard> get(String name) {
        for (CreditCard card : cards) {
            if (card.getName().equalsIgnoreCase(name)) {
                return Optional.of(card);
            }
        }
        return Optional.empty();
    }

    //
//    public Integer getSpacialNumber(Long numbers) {
//        String number = numbers.toString(numbers);
//        List<String> nums = getSplintList(number);
//
//        String numEmpty = "";
//        Integer spacialNumber ;
//        for (int i = 0; i < 2; i++) {
//            String numString = nums.get(i);
//            Integer numIntager = Integer.valueOf(numString);
//            if (numIntager == 4) {
//                Integer spacialNumber4 = 4;
//                return spacialNumber=spacialNumber4;
//
//            } else {
//                String numString2 = numIntager.toString(numIntager);
//
//                numEmpty = numEmpty + numString2;
//                Integer spacialNumber1 = Integer.valueOf(numEmpty);
//                return spacialNumber=spacialNumber1;
//
//            }
//        }
//        return spacialNumber;
//    }
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
