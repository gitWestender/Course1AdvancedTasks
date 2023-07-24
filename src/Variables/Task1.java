package Variables;

public class Task1 {
    static int count = 1;

    public static void main(String[] args) {
        task1(47, 13);
        task2(44);
        task3(345);
        task4();
        task5();
        task6();
    }

    static void task1(int a, int b) {
        System.out.println("\nЗадание " + count++);
        int it = a / b;
        int re = a % b;
        System.out.println("Выходит " + it + " и " + re + " в остатке");
    }

    static void task2(int a) {
        System.out.println("\nЗадание " + count++);
        int x = a / 10;
        int y = a % 10;
        System.out.println("Сумма цифр числа " + a + " равна " + (x + y));
    }

    static void task3(int a) {
        System.out.println("\nЗадание " + count++);
        int h = a / 100;
        int d = (a - (h * 100)) / 10;
        int p = (a - (h * 100)) % 10;
        System.out.println("Сумма цифр числа " + a + " равна " + (h + d + p));
    }

    static void task4() {
        System.out.println("\nЗадание " + count++);
        int bouquetPrice = 4899;
        int cardPrice = 157;

        int totalPriceWithdiscount = (int) ((bouquetPrice + cardPrice) * 0.9);
        int totalDiscount = bouquetPrice + cardPrice - totalPriceWithdiscount;
        System.out.println("Сумма покупки с учетом скидки " + totalPriceWithdiscount + " Скидка состаялет " + totalDiscount);
    }

    static void task5() {
        System.out.println("\nЗадание " + count++);
        int orangePrice = 73;
        int orangeDiscount = 15;
        int bananaPrice = 95;
        int orangeWeight = 10;
        int bananaWeight = 2;

        double result = (orangeWeight * orangePrice) - ((orangeWeight * orangePrice) * (orangeDiscount / 100f)) + (bananaWeight * bananaPrice);
        System.out.println(result);

    }

    static void task6() {
        System.out.println("\nЗадание " + count++);
        double x = 0.40;
        double y = 0.87;
        System.out.println(11 * x - y);
        System.out.println((x + 10 * y) - 15 * (x / y));
    }
}
