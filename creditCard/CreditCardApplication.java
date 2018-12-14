package creditCard;


import java.util.Scanner;


public class CreditCardApplication {
    public static void main(String[] args) {
        Validate validate = new Validate();
        Card card = new Card();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number !!");
        Long cardNumber = scanner.nextLong();

        if (validate.iSCheckValidate(cardNumber)) {
            card.display(cardNumber);
        }


    }


}
