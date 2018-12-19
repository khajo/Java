package handshake;

import java.util.List;

public class HandShakeApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator secretHandshakeMovesTranslator = new SecretHandshakeMovesTranslator();
        List<String> secretHandyShakes = secretHandshakeMovesTranslator.getSecretHandShakesList(214534579);
        System.out.println(secretHandyShakes);

    }
}
