package task25;

//        Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.

public class CardAncestor implements PaymentSystem {

    String color;
    String bank;
    String currency;
    String system;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public void visa() {
        system = "Visa";
    }

    @Override
    public void mastercard() {
        system = "Mastercard";
    }

    @Override
    public void printSystem() {
        if(system == "Visa") {
            System.out.println("I'm friends with Visa.");
        } else {
            System.out.println("I'm friends with Mastercard.");
        }
    }
}
