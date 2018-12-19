package handshake;

import java.util.Arrays;
import java.util.List;

public class HandShakes {
    private static List<Handshake> movies = Arrays.asList(new BroKnock(new String()), new ThousandKnuckles(new String()),
            new ThumbTouchesBack(new String()), new TicklesOverPalm(new String()));


    public static List<Handshake> getHandShakes() {
        return movies;
    }
}
