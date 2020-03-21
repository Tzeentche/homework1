package task2;

//      Продолжите приведенный пример, добавьте расчет и вывод суток и недель.

public class DaysAndWeeks {

    public static void main(String[] args) {

        int s = 506923;
        int sec, m, min, h, hours, d, days, w, weeks;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = (h - hours) / 24;
        days = d % 7;
        w = (d - days) / 7;

        System.out.println("Недель: " + w + " дней: " + days);
        System.out.println(" часов: " + hours + " минут: " + min + " секунд: " + sec);

    }
}