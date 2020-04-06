package task25;

//      Создать иерархию классов, описывающих банковские карточки.
//      Иерархия должна иметь хотя бы 3 уровня.

public class MainBankCards {

    public static void main(String[] args) {

        CardAncestor cardAncestor = new CardAncestor();
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();
        OverdraftCard overdraftCard = new OverdraftCard();
        VirtualCard virtualCard = new VirtualCard();
        TestCardStrip testCardStrip = new TestCardStrip();

        System.out.println("Hello! I'm a card-ancestor. I'm first. My color is " + cardAncestor.getColor());
        System.out.println("I'm first. My bank is " + cardAncestor.getBank());
        System.out.println("I'm first. My currency is " + cardAncestor.getCurrency());
        System.out.println();

        System.out.println("Hello! I'm a card-child. I'm first. My color is " + debitCard.getColor());
        System.out.println("I'm first. My bank is " + debitCard.getBank());
        System.out.println("I'm first. My currency is " + debitCard.getCurrency());
        debitCard.isNamed();
        System.out.println();

        System.out.println("Hello! I'm a card-uncle. I'm first. My color is " + creditCard.getColor());
        System.out.println("I'm first. My bank is " + creditCard.getBank());
        System.out.println("I'm first. My premium level is " + creditCard.getPremiumLevel());
        System.out.println("I'm first. My currency is " + creditCard.getCurrency());
        System.out.println();

        System.out.println("Hello! I'm a card-child. I'm first. My color is " + overdraftCard.getColor());
        System.out.println("I'm first. My bank is " + overdraftCard.getBank());
        System.out.println("I'm first. My currency is " + overdraftCard.getCurrency());
        if(overdraftCard.getIsNFC()) { System.out.println("I have a NFC-system"); }
        if(overdraftCard.isNamed()) { System.out.println("I have personal name"); }
        System.out.println();

        System.out.println("Hello! I'm a card-child. I'm first. My color is " + virtualCard.getColor());
        System.out.println("I'm first. My bank is " + virtualCard.getBank());
        System.out.println("I'm first. My currency is " + virtualCard.getCurrency());
        if(virtualCard.getIsApplePay()) { System.out.println("I have Apple-pay system"); }
        if(virtualCard.isNamed()) { System.out.println("I have personal name"); }
        System.out.println();

        System.out.println("Hello! I'm a card-child. I'm first. My color is " + testCardStrip.getColor());
        System.out.println("I'm first. My bank is " + testCardStrip.getBank());
        System.out.println("I'm first. My currency is " + testCardStrip.getCurrency());
        if(testCardStrip.getIsApplePay()) { System.out.println("I have Apple-pay system"); }
        if(testCardStrip.isNamed()) { System.out.println("I have personal name"); }
        if(testCardStrip.getIsOpenSource()) { System.out.println("I have open source development"); }
        testCardStrip.isNamed();
    }
}
