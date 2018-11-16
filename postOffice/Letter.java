package weekP2.Ex1.postOffice;

public class Letter {
    private String address;

    public Letter(String address) {
        this.address = address;
    }

    private Boolean stamped = false;


    public Boolean isStamped() {
        return stamped;
    }

    public String getAddress() {
        return address;
    }

    public void stamp() {
        this.stamped = true;
    }
}
/*The Letter has an address and also a boolean that states if it is stamped. It has a getAddress method.
 It also has a isStamped method that returns whether the letter has been stamped.
  It also has a stamp method that sets the stamped attribute to true.
*/