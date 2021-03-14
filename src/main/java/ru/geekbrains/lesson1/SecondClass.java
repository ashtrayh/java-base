package ru.geekbrains.lesson1;

public class SecondClass {
    // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат.
      static float calculate(float a, float b, float c, float d) {
            return a * (b + (c / d));
        }
    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static boolean sumValue(int e, int f) {
          int sum = e + f;
        return sum >= 10 && sum <= 20;
    }
    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void posOrNeg(int g) {
        if (g >= 0) System.out.println("Число положительное" + ".\n");
        else System.out.println("Число отрицательное" + ".\n");
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean posOrNeg2(int h) {
       return h < 0;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static void hello(String name) {
        System.out.println("Привет, " + name + "!" +"\n");
    }

    // 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void year(int y) {
          if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) System.out.println("Год високосный" + ".\n");
          else System.out.println("Год невисокосный" + ".\n");
    }

    public static void main(String[] args) {

         // Задание 3.
        System.out.println("Задание 3.");
        System.out.println("Результат = " + calculate(10.2f, 21.31f, 78.56f, 58.231f) + ".\n");

        // Задание 4.
        System.out.println("Задание 4.");
        System.out.println("Результат: " + sumValue(2, 13) + ".\n");

        // Задание 5.
        System.out.println("Задание 5.");
        posOrNeg(0);

        // Задание 6.
        System.out.println("Задание 6.");
        System.out.println("Результат: " + posOrNeg2(-10) + ".\n");

        // Задание 7.
        System.out.println("Задание 7.");
        hello("Гермиона Грейнджер");

        // Задание 8.
        System.out.println("Задание 8.");
        year(2018);
    }

    }

