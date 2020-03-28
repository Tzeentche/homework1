package task24;

public class ApplianceAncestor implements AcDc{

    double length;
    double width;
    double weight;
    String color;
    int highLowVoltage;
    protected boolean state = false;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHighLowVoltage() {
        return highLowVoltage;
    }

    public void setHighLowVoltage(int highLowVoltage) {
        this.highLowVoltage = highLowVoltage;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public void printState() {
        if(state) {
            System.out.println("I'm is On!");
        } else {
            System.out.println("I'm is Off!");
        }
    }
}
