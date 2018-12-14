package creditCard;

import java.util.List;
import java.util.Optional;

import static coffeeMaker.CoffeeMakers.get;

public class CreditCardApplication {
    public static void main(String[] args) {
      Validate validate =  new Validate();
        Long cardNumber = 4111111111111111L;
        Integer sum = validate.getSum(cardNumber);
        System.out.println(sum);
        boolean isValid = validate.iSCheckValidate(sum);
        Card card = new Card();

        System.out.println(isValid);
     if(isValid){
         String n = card.getCard(cardNumber);
         System.out.println(card.get(n).get().getName());

     }



//
//        System.out.println(isValid);
//        String number = cardNumber.toString(cardNumber);
//        String[] splint = number.split("");
//        List<String> allNumbers = Arrays.asList(splint);
//        System.out.println(allNumbers);
//        System.out.println(number);
        


    }
    private static void display(CreditCard card) {
        System.out.println(card.getName());
    }

    private static void displayBrewedCoffeeWithCoffeeMaker(String name) {
        Card card1 = new Card();
        Optional<CreditCard> card = card1.get(name);
        if (card.isPresent()) {
            CreditCard c = card.get();
            display(c);
        }
    }

}
