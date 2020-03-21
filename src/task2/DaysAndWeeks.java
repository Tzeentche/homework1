package task2;

//      Продолжите приведенный пример, добавьте расчет и вывод суток и недель.

public class DaysAndWeeks {

    public static void main(String[] args) {

        int s = 506923;
        int sec, m, min, h, hours, d, days, w, weeks;
        sec = s % 60;
        System.out.println(sec + " 40");
        m = (s - sec) / 60;
        System.out.println(m + " 6166");
        min = m % 60;
        System.out.println(min + " 46");
        h = (m - min) / 60;
        System.out.println(h + " 102");

        hours = h % 24;
        System.out.println(hours + " ??");
        d = (h - hours) / 24;
        System.out.println(d + " ???");
        days = d % 7;
        System.out.println(days + " ????");
        w = (d - days) / 7;
        System.out.println(w + " ?????");
//        weeks = w % 7;
//        System.out.println(weeks + " ??????");

        System.out.println("Недель: " + w + " дней: " + days);
        System.out.println(" часов: " + hours + " минут: " + min + " секунд: " + sec);

    }
}