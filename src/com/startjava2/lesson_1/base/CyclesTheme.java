package com.startjava2.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNums = 0;
        int sumOddNums = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEvenNums +
                ", а нечетных = " + sumOddNums);

        System.out.println("\nЗадача 2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (num2 > num1) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num1 < num2) {
            min = num1;
        }

        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
            sum += digit;
        }

        System.out.println("\nСумма его цифр: " + sum);

        System.out.println("\nЗадача 4. Вывод чисел в несколько строк");
        int start = 1;
        int finish = 24;
        int columns = 0;
        for (int i = start; i < finish; i += 2) {
            if (columns % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            columns++;
        }

        if (columns % 5 != 0) {
            for (int i = columns; i % 5 != 0; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадача 5. Проверка количества двоек числа на четность/нечетность");
        num = 3_242_592;
        System.out.print("В числе " + num);
        int twosCount = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                twosCount++;
            }
            num /= 10;
        }

        if (twosCount % 2 == 0) {
            System.out.println(" четное количество двоек - " + twosCount);
        } else {
            System.out.println(" нечетное количество двоек - " + twosCount);
        }

        System.out.println("\nЗадача 6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        columns = 5;
        int rows = 5;
        while (rows > 0) {
            while (columns > 0) {
                System.out.print('#');
                columns--;
            }
            System.out.println();
            columns = rows - 1;
            rows--;
        }
        System.out.println();

        columns = 0;
        rows = 0;
        do {
            do {
                System.out.print('$');
                columns++;
            } while (columns <= rows && columns < 3);
            System.out.println();
            rows++;
            if (rows < 3) {
                columns = 0;
            } else {
                columns = rows - 2;
            }
        } while (rows < 5);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.printf("%-8S%-10S%-11S\n", "decimal", "character", "description");
        for (int i = 15; i < 123; i++) {
            if ((i % 2 != 0 && i < 48) || (i > 96 && i % 2 == 0)) {
                System.out.printf("  %-10d%-11c%s\n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        num = 1_234_321;
        System.out.print("Число " + num);
        int copyNum = num;
        int reverseNum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            reverseNum = reverseNum * 10 + digit;
        }

        if (copyNum == reverseNum) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        num = 864_675;
        System.out.print("Число " + num);
        int leftHalfNum = num / 1000;
        int rightHalfNum = num % 1000;
        int leftSum = 0;
        int rightSum = 0;
        while (leftHalfNum > 0) {
            int digit = leftHalfNum % 10;
            leftHalfNum /= 10;
            leftSum += digit;
            digit = rightHalfNum % 10;
            rightHalfNum /= 10;
            rightSum += digit;
        }

        if (leftSum == rightSum) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }

        System.out.println("Сумма цифр " + (num / 1000) + " = " + leftSum +
                ", а сумма цифр " + (num % 1000) + " = " + rightSum);

        System.out.println("\nЗадача 10. Отображение таблицы умножения Пифагора");
        System.out.printf("%22S\n", "таблица пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 1 && j == 1) {
                    System.out.printf("%3s", "|");
                } else if (j == 1) {
                    System.out.printf("%3s", i * j + "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }

            if (i == 1) {
                System.out.print("\n---------------------------");
            }

            System.out.println();
        }
    }
}
