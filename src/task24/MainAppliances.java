package task24;

//      Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
//      часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.

public class MainAppliances {

    public static void main(String[] args) {

        ApplianceAncestor ancestor = new ApplianceAncestor();
        Refregerator refregerator = new Refregerator();
        Freezer freezer = new Freezer();
        AutoFreezer autoFreezer = new AutoFreezer();

        System.out.println("Hello! I'm an ancestor! My length is " + ancestor.getLength());
        System.out.println("My width is " + ancestor.getWidth());
        System.out.println("My weight is " + ancestor.getWeight());
        System.out.println("My color is " + ancestor.getColor());
        System.out.println("My power consumption is " + ancestor.getHighLowVoltage());
        ancestor.printState();

        System.out.println("Hello! I'm a refregerator! My length is " + refregerator.getLength());
        System.out.println("My width is " + refregerator.getWidth());
        System.out.println("My weight is " + refregerator.getWeight());
        System.out.println("My color is " + refregerator.getColor());
        System.out.println("My power consumption is " + refregerator.getHighLowVoltage());
        refregerator.printState();

        System.out.println("Hello! I'm a freezer! My length is " + freezer.getLength());
        System.out.println("My width is " + freezer.getWidth());
        System.out.println("My weight is " + freezer.getWeight());
        System.out.println("My color is " + freezer.getColor());
        System.out.println("My power consumption is " + freezer.getHighLowVoltage());
        freezer.printState();

        System.out.println("Hello! I'm a auto Freezer! My length is " + autoFreezer.getLength());
        System.out.println("My width is " + autoFreezer.getWidth());
        System.out.println("My weight is " + autoFreezer.getWeight());
        System.out.println("My color is " + autoFreezer.getColor());
        System.out.println("My power consumption is " + autoFreezer.getHighLowVoltage());
        autoFreezer.printState();
    }
}
