package task25;

public class TestCardStrip extends VirtualCard {

    boolean isOpenSource;

    public TestCardStrip() {

        setColor("No");
        setBank("Strip");
        setCurrency("USD");
        setNamed(false);
        setIsNFC(false);
        setIsApplePay(false);
        visa();
        setIsOpenSource(true);
    }

    public boolean getIsOpenSource() {
        return isOpenSource;
    }

    public void setIsOpenSource(boolean openSource) {
        isOpenSource = openSource;
    }

}
