package task25;

public class VirtualCard extends OverdraftCard {

    public VirtualCard() {

        setColor("Green");
        setBank("MTBank");
        setPremiumLevel("Black");
        setCurrency("BIT");
        setNamed(false);
        mastercard();
    }
}
