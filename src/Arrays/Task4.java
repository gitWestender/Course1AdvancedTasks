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
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);
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

}
