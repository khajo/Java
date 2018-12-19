package handshake;

public abstract class Handshake {

    private String moveNumber;

    public Handshake(String moveNumber) {
        this.moveNumber = moveNumber;
    }

    public abstract String getName();

    public Boolean isThere(String num) {

        if (!num.contains(moveNumber)) {
            return false;
        }
        return true;
    }
}
