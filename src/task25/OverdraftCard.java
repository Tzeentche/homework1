package task25;

public class OverdraftCard extends DebitCard {

    public OverdraftCard() {

        setColor("Red");
        setBank("MTBank");
        setPremiumLevel("Simple");
        setCurrency("BYN");
        setNamed(false);
        visa();
    }
}
