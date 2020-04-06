package task25;

public class VirtualCard extends OverdraftCard {

    boolean isApplePay;

    public VirtualCard() {

        setColor("Green");
        setBank("MTBank");
        setCurrency("BIT");
        setNamed(false);
        setIsNFC(false);
        setIsApplePay(true);
        mastercard();
    }

    public boolean getIsApplePay() {
        return isApplePay;
    }

    public void setIsApplePay(boolean isApplePay) {
        isApplePay = isApplePay;
    }
}
