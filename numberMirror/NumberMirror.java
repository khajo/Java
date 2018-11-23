package week3P2.numberMirror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {

    public Integer mirror(Integer number) {
        List<String> stringNumbers = changeNumberToListOfString(number);
        Collections.reverse(stringNumbers);
        String mirrorStringNumber = join(stringNumbers);
        Integer mirrorNumber = Integer.valueOf(mirrorStringNumber);
        return mirrorNumber;
    }

    private List<String> changeNumberToListOfString(Integer number) {

        String text = number.toString();
        String[] split = text.split("");
        List<String> numbers = new ArrayList<>(Arrays.asList(split));
        return numbers;
    }

    private String join(List<String> numbers) {

        String number = "";
        for (String number1 : numbers
        ) {
            number = number + number1;
        }
        return number;
    }


    //I'm not done with it. I'm sorry :(
    public Integer specialMirror(Integer number) {

        Integer newNumber = mirror(number);
        List<String> numbers = changeNumberToListOfString(newNumber);
        List<Integer> numbers1 = new ArrayList<>();
        String specialMirror = "";

        for (String number1 : numbers) {
            Integer newumber = Integer.valueOf(number1);
            if (newNumber > 9) {
                newNumber = newNumber % 9;
                newNumber = newNumber + 1;

                specialMirror = specialMirror + newNumber;

            }
        }

        Integer mirrorNumber = Integer.valueOf(specialMirror);


        return mirrorNumber;
    }

 
}
