package task25;

public class DebitCard extends CardAncestor {

    boolean isNamed;

    public DebitCard() {

        setColor("Black");
        setBank("Alfa-Bank");
        setCurrency("USD");
        setNamed(true);
        visa();
    }

    public boolean isNamed() {
        return isNamed;
    }

    public void setNamed(boolean named) {
        isNamed = named;
    }
}
