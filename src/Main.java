public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("task 2");
        for (int b = 10; b > 0; b--) {
            System.out.println(b);
        }

        System.out.println("task 3");
        for (int v = 0; v <= 17; v = v + 2) {
            System.out.println(v);
        }

        System.out.println("task 4");
        for (int g = 10; g >= -10; g--) {
            System.out.println(g);
        }

        System.out.println("task 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }

        System.out.println("task 6");
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        System.out.println("task 7");
        for (int r = 1; r <= 512; r = r * 2) {
            System.out.println(r);
        }

        System.out.println("task 8");
        int sal = 29000;
        int total = 0;
        for (int t = 0; t <= 12; t = t + 1) {
            total = total + sal;
            System.out.println("Месяц " + t + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("task 9");
        int total2 = 0;
        for (int t = 0; t <= 12; t = t + 1) {
            total2 = total2 + sal;
            total2 = total2 + total2/100;
            System.out.println("Месяц " + t + ", сумма накоплений равна " + total2 + " рублей");
        }

        System.out.println("task 10");
        int i = 0;
        for (int u = 1; u <= 10; u = u + 1) {
            i = 2 * u;
            System.out.println("2 * " + u + " = " + i);
        }
    }
}