package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {

    static Random rnd = new Random();
    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:\n", counter++);
        int[] array = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else odd++;
        }

        System.out.println("Четных чисел " + even + ", нечетных чисел " + odd);
    }

    static void task2() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    static void task3() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int lenght = 5;
        int[] firstNumbers = new int[lenght];
        int[] secondNumbers = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            firstNumbers[i] = ThreadLocalRandom.current().nextInt(0, 5 + 1);
            secondNumbers[i] = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        }

        int firstSumm = 0, secondSum = 0;

        for (int i = 0; i < lenght; i++) {
            firstSumm += firstNumbers[i];
            secondSum += secondNumbers[i];
        }

        double firstAVG = firstSumm / lenght, secondAVG = secondSum / lenght;

        String result = firstAVG > secondAVG ? "Ср.знач первого массива больше, чем второго"
                : (firstAVG < secondAVG ? "Ср.знач второго массива больше, чем первого" : "Ср.знач равны");

        System.out.println(result);
    }

    static void task4() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] array = new int[4];
        boolean bool = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 99 + 1);
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                continue;
            } else {
                bool = false;
                break;
            }
        }

        System.out.println(bool);
    }

    static void task5() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] fibonachiArray = new int[20];
        int number = 1;

        for (int i = 1; i < fibonachiArray.length; i++) {
            fibonachiArray[i] = number;
            number += fibonachiArray[i - 1];
        }

        System.out.println(Arrays.toString(fibonachiArray));
    }
}
