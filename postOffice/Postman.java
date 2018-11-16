package weekP2.Ex1.postOffice;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    private List<Letter> letters = new ArrayList<>();


    public void deliver(List<Letter> letters) {


        for (Letter letter : letters) {
            System.out.println("he delivered it to its address: " + letter.getAddress());
            letters.remove(letter);
        }

    }


}


/*Create the class Postman that has a list of Letter. It has the deliver method that goes through all the letters he has and one by one,
 says that he delivered it to its address and removes it from his list (until there are no more letters left).
*/