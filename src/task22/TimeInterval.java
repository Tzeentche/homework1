package task22;

//      Создать класс и объекты, описвающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
//      секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
//      (метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество секунд, и
//      часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class TimeInterval {

    int sec;
    int min;
    int hours;

    int returnSeconds() {
        int resultIs = (hours * 360) + (min * 60) + sec;
        System.out.println("Return seconds " + resultIs);
        return resultIs;
    }

    int objectsCompare() {
        if(this.sec >= this.returnSeconds()) {
            System.out.println("Object 1 > Object 2");
        } else {
            System.out.println("Object 1 < Object 2");
        }
        return this.sec - this.returnSeconds();
    }

    public TimeInterval() {
    }

    public TimeInterval(int secValue) {
        sec = secValue;
        System.out.println("Time interval secValue is " + sec);
    }

    public TimeInterval(int hours, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    void outputter(int ) {

    }

    void outputter(int hours, int min, int sec) {
        System.out.println("Time interval counting result in hours, minutes and seconds is " + hours + ":" + min + ":" + sec + "!");
    }
}
