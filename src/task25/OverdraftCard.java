package task25;

public class OverdraftCard extends DebitCard {

    boolean isNFC;

    public OverdraftCard() {

        setColor("Red");
        setBank("MTBank");
        setCurrency("BYN");
        setNamed(false);
        visa();
        setIsNFC(true);
    }

    public boolean getIsNFC() {
        return isNFC;
    }

    public void setIsNFC(boolean NFC) {
        isNFC = NFC;
    }
}
