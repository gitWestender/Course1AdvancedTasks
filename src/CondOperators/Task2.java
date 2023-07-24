package CondOperators;

import java.util.Random;

//Доп задания по условным операторам
public class Task2 {

    static int count = 1;
    static Random rnd = new Random();

    public static void main(String[] args) {
        task1(13);
        task2(7.3, 11.13);
        task3();
        task4();
        task5(12, 6, 4);
    }

    static void task1(int p) {
        System.out.println("\nЗадание " + count++);
        if (p == 0) {
            System.out.println("Ноль - четное число");
        } else if (p % 2 == 0) {
            System.out.println(p + " - четное число");
        } else {
            System.out.println(p + " - нечетное число");
        }
    }

    static void task2(double p, double d) {
        System.out.println("\nЗадание " + count++);
        if (Math.abs(p - 10) > Math.abs(d - 10)) {
            System.out.println(d);
        } else {
            System.out.println(p);
        }
    }

    static void task3() {
        System.out.println("\nЗадание " + count++);
        int a = 3 + rnd.nextInt(158);
        if (a > 22 && a < 99) {
            System.out.println("Число " + a + " попало в интервал (22;99)");
        } else {
            System.out.println("Число " + a + " непопало в интервал (22;99)");
        }
    }

    static void task4() {
        System.out.println("\nЗадание " + count++);
        int a = 100 + rnd.nextInt(900);
        int h = a / 100;
        int d = (a - h * 100) / 10;
        int p = (a - h * 100) % 10;

        if (h >= d && h >= p) {
            System.out.println("Число " + a + " Наибольщий член " + h);
        } else if (d > p) {
            System.out.println("Число " + a + " Наибольщий член " + d);
        } else {
            System.out.println("Число " + a + " Наибольщий член " + p);
        }
    }

    static void task5(int a, int b, int c) {
        System.out.println("\nЗадание " + count++);

        if (a != b && b != c) {
            if (a >= b && a >= c) {
                if (b > c) {
                    System.out.println(c + " " + b + " " + a);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else if (b >= c) {
                if (a >= c) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                if (a >= b) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        } else {
            System.out.println("Указанны равные числа");
        }
    }

    static void task6() {
        System.out.println("\nЗадание " + count++);
    }

}
