package handshake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {

    public List<String> getSecretHandShakesList(Integer number) {
        List<String> secretHandShakes = new ArrayList<>();
        String diget = number.toString();
        List<String> digets = getSplintList(diget);
        for (String num : digets) {
            String move = findMove(num);
            if (move.contains(" "))
                secretHandShakes.add(move);
        }


        return secretHandShakes;
    }

    public String findMove(String diget) {
        List<Handshake> moves = HandShakes.getHandShakes();
        String handShake = "";
        for (Handshake move : moves) {
            if (move.isThere(diget)) {
                handShake = move.getName();
                return handShake;
            }
        }
        return handShake;
    }

    public List<String> getSplintList(String number) {
        String[] splint = number.split("");
        List<String> allnumbers = Arrays.asList(splint);
        return allnumbers;
    }

}
