package task24;

//      Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
//      часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.

public class Refregerator extends ApplianceAncestor {

    public Refregerator() {

        setLength(100.00);
        setWidth(50.00);
        setWeight(40.00);
        setColor("Gray");
        setHighLowVoltage(220);
        on();
    }
}
