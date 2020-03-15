package task23;

//      Создать класс и объекты, описывающие Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//      количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат. Сделать функцию, снимающую деньги.
//      На вход передается сумма денег.

public class MainATM {

    public static void main(String[] args) {

        ATMInterpretator atm = new ATMInterpretator();
        ATMLogic logic = new ATMLogic();

        atm.helloMessage();
        System.out.println("Some text 1");
        String trigger = atm.depositOrWithdraw();
        System.out.println("Some text 2");
        logic.startWorking(trigger);
        System.out.println("Some text 3");
    }
}
