package task25;

public class CreditCard extends CardAncestor {

    String premiumLevel;

    public CreditCard() {

        setColor("Orange");
        setBank("VTB");
        setCurrency("BYN");
        mastercard();
        setPremiumLevel("Gold");
    }

    public String getPremiumLevel() {
        return premiumLevel;
    }

    public void setPremiumLevel(String premiumLevel) {
        this.premiumLevel = premiumLevel;
    }
}
