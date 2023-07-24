package Arrays;

import java.util.Random;

public class Task4 {

    static Random rnd = new Random();
    static int counter = 1;
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        System.out.println("\nЗадание " + counter++);
        int[] array = new int [15];
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

}
