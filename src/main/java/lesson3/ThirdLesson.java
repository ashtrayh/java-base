package lesson3;

import java.util.Random;
import java.util.Scanner;

public class ThirdLesson {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        GuessTheNumber();
    }

    public static void GuessTheNumber() {
        int a;
        int n = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9 с трёх попыток:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ", введите число: ");
            a = in.nextInt();
            if (a < 0 || a > 9) System.out.println("Число не соответствует заданным условиям!");
           else if (a < n) System.out.println("Загаданное число больше введённого!");
           else if (a > n) System.out.println("Загаданное число меньше введённого!");
           else if (a == n) {
                System.out.println("Поздравляю, Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                while (true) {
                    String choice = in.next();
                    switch (choice) {
                        case "1":
                            GuessTheNumber();
                            break;
                        case "0":
                            System.out.println("Спасибо за игру!");
                            return;
                    }
                }
            }
        }
        System.out.println("К сожавлению, Вы не угадали!");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        while (true) {
            String choice = in.next();
            switch (choice) {
                case "1":
                    GuessTheNumber();
                    break;
                case "0":
                    System.out.println("Спасибо за игру!");
                    return;
            }
        }
    }
}
