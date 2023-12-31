package Cycles;

public class Task3 {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    static void task1() {
        System.out.println("\nЗадание " + counter++);
        int startNumber = 1000;
        int quantity = 5;
        int divider = 4;

        while (quantity > 0) {
            if (startNumber % divider == 0) {
                System.out.print(startNumber + " ");
                quantity--;
            }
            startNumber++;
        }
    }

    static void task2() {
        System.out.println("\nЗадание " + counter++);
        int quant = 10;
        int step = 2;
        int startNum = 1;

        for (int i = 0; i < quant; i++) {
            System.out.print(startNum + " ");
            startNum += step;
        }
    }

    static void task3() {
        System.out.println("\nЗадание " + counter++);
        int startNum = 90;
        int step = 5;

        while (startNum >= 0) {
            System.out.print(startNum + " ");
            startNum -= step;
        }
    }

    static void task4() {
        System.out.println("\nЗадание " + counter++);
        int startNum = 2;
        int count = 10;

        while (count > 0) {
            System.out.print(startNum + " ");
            startNum *= 2;
            count--;
        }
    }

    static void task5() {
        System.out.println("\nЗадание " + counter++);
        int mounthDays = 31;
        int correntDay = 1;
        int week = 7;

        while (correntDay <= mounthDays) {
            System.out.print(correntDay + " " + (correntDay + 1) + " ");
            correntDay += week;
        }
    }

    static void task6() {
        System.out.println("\nЗадание " + counter++);
        int startNum = 1;
        int finishNum = 999999;
        int count = 0;

        for (int i = startNum; i < finishNum; startNum++) {
            int firstPart = i / 1000;
            int lastPart = i % 1000;

            if (firstPart == 0 || lastPart == 0) {
                continue;
            }

            int firstPartSum = sumOfDigits(firstPart);
            int lastPartSum = sumOfDigits(lastPart);

            if (firstPartSum == lastPartSum) {
                count++;
            }
        }

        System.out.println(count);

    }

    static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }
}
