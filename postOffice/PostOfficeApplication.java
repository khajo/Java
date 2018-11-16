package weekP2.Ex1.postOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {

    public static void main(String[] args) {
        Letter letter = new Letter("Sonnenallee 41");
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.send(letter);
        letter.stamp();
        postOfficeAssistant.send(letter);

        List<Letter> letters = new ArrayList<>();
        Letter letter1 = new Letter("Karlsplatz 10");
        Letter letter2 = new Letter("Hardegasse 22");
        Letter letter3 = new Letter("Hanna Ardent Platz 13");

        letters.add(letter1);
        letters.add(letter2);
        //   letters.add(letter3);

        Postman postman = new Postman();
        postman.deliver(letters);

    }
}

/*In the PostOfficeApplication class main method, create a Letter and a PostOfficeAssistant,
 and use it to stamp the letter and then send it.


****************************************************************


 In the PostOfficeApplication class main method, create three letters and a Postman with them, and use it to deliver all the letters.

*/