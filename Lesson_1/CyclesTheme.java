public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел");
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        int num = -10;
        do {
            if (num % 2 == 0) {
                evenNumbersSum += num;
            } else {
                oddNumbersSum += num;
            }
            num++;
        } while (num <= 21);

        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenNumbersSum +
                ", а нечетных = " + oddNumbersSum);

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
        num = 1234;
        int sum = 0;
        int reverseNum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            reverseNum = reverseNum * 10 + digit;
        }

        System.out.println("Исходное число в обратном порядке: " + reverseNum);
        System.out.println("Сумма его цифр: " + sum);

        System.out.println("\nЗадача 4. Вывод чисел в несколько строк");
        int startOfSegment = 1;
        int finishOfInterval = 24;
        int countOfNumbersInRow = 0;
        for (int i = startOfSegment; i < finishOfInterval; i++) {
            if (countOfNumbersInRow % 5 == 0 && i % 2 != 0) {
                System.out.println();
            }

            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                countOfNumbersInRow++;
            }
        }

        if (countOfNumbersInRow % 5 != 0) {
            for (int j = countOfNumbersInRow; j % 5 != 0; j++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\nЗадача 5. Проверка количества двоек числа на четность/нечетность");
        num = 3_242_592;
        System.out.print("В числе " + num);
        int countOfTwos = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 2) {
                countOfTwos++;
            }
        }

        if (countOfTwos % 2 == 0) {
            System.out.println(" четное количество двоек - " + countOfTwos);
        } else {
            System.out.println(" нечетное количество двоек - " + countOfTwos);
        }

        System.out.println("\nЗадача 6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int numberOfGridsInLine = 5;
        int numberOfLines = 5;
        while (numberOfLines > 0) {
            while (numberOfGridsInLine > 0) {
                System.out.print('#');
                numberOfGridsInLine--;
            }
            System.out.println();
            numberOfGridsInLine = numberOfLines - 1;
            numberOfLines--;
        }
        System.out.println();

        int numberOfDollarsInLine = 0;
        numberOfLines = 0;
        do {
            do {
                System.out.print('$');
                numberOfDollarsInLine++;
            } while (numberOfDollarsInLine <= numberOfLines && numberOfDollarsInLine < 3);
            System.out.println();
            numberOfLines++;
            if (numberOfLines < 3) {
                numberOfDollarsInLine = 0;
            } else {
                numberOfDollarsInLine = numberOfLines - 2;
            }
        } while (numberOfLines < 5);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.printf("%-8S%-10S%-11S\n", "decimal", "character", "description");
        for (int i = 1; i < 48; i++) {
            if (i < 15 || (i >= 15 && i % 2 != 0)) {
                System.out.printf("%4d%9c     %s\n", i, (char) i, Character.getName(i));
            }
        }

        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%4d%9c     %s\n", j, (char) j, Character.getName(j));
            }
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        num = 1_234_321;
        System.out.print("Число " + num);
        int copyNum = num;
        reverseNum = 0;
        while (num != 0) {
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
        while (leftHalfNum != 0) {
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
