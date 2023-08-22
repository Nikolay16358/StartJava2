public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Это женщина!");
        } else {
            System.out.println("Это мужчина!");
        }

        int age = 23;
        if (age > 18) {
            System.out.println("Мне уже можно водить машину!");
        } else {
            System.out.println("Мне еще рано садиться за руль.");
        }

        double height = 2.15;
        if (height < 1.8) {
            System.out.println("Меня не возьмут играть за баскетбольную команду(");
        } else {
            System.out.println("Я будущая звезда LA Lakers!");
        }

        char firstLetterOfName = "Maximus".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("I am a Gladiator!");
        } else if (firstLetterOfName == 'I') {
            System.out.println("My name is Invoker!");
        } else {
            System.out.println("What did you say about my mom?!?!");
        }

        System.out.println("\nЗадача 2. Поиск большего числа");
        int num1 = 5;
        int num2 = 7;
        System.out.println("Дано два целых числа: " + num1 + " и " + num2);
        int max = num1;
        if (num1 == num2) {
            System.out.println("Эти числа равны между собой");
        } else {
            if (num2 > num1) {
                max = num2;
            }
            System.out.println("Большее число равно " + max);
        }

        System.out.println("\nЗадача 3. Проверка числа");
        num1 = 10;
        System.out.print("Число " + num1 + " является ");
        if (num1 == 0) {
            System.out.println("0");
        } else {
            if (num1 > 0) {
                System.out.print("положительным и ");
            } else {
                System.out.print("отрицательным и ");
            }

            if (num1 % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        System.out.println("Исходные числа равны " + num1 + " и " + num2);
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = (num1 % 100) / 10;
        int tens2 = (num2 % 100) / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("Цифры в одних и тех же разрядах у этих чисел разные");
        } else {
            if (hundreds1 == hundreds2) {
                System.out.println("У этих чисел одинаковое количество сотен: " + hundreds1);
            }

            if (tens1 == tens2) {
                System.out.println("У этих чисел одинаковое количество десятков: " + tens1);
            }

            if (ones1 == ones2) {
                System.out.println("У этих чисел одинаковое количество единиц: " + ones1);
            }
        }

        System.out.println("\nЗадача 5. Определение символа по его коду");
        char sign = '\u0057';
        System.out.print("Символ " + sign + " является ");
        if (sign > '`' && sign < '{') {
            System.out.println("маленькой буквой");
        } else if (sign > '@' && sign < '[') {
            System.out.println("большой буквой");
        } else if (sign > '/' && sign < ':') {
            System.out.println("цифрой");
        } else {
            System.out.println("не буквой и не цифрой");
        }

        System.out.println("\nЗадача 6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        System.out.println("Сумма вклада составляет " + deposit + " руб.");
        double bankRate = 0.10;
        if (deposit < 100_000) {
            bankRate = 0.05;
        } else if (deposit < 300_000) {
            bankRate = 0.07;
        } 

        double interestAmount = deposit * bankRate;
        System.out.println("Сумма начисленного % составляет " + (int) interestAmount + " руб.");
        System.out.println("Итоговая сумма с % составляет " + (int) (deposit + interestAmount) + " руб.");

        System.out.println("\nЗадача 7. Определение оценки по предметам");
        int historyPoints = 59;
        int programmingPoints = 92;
        int historyMark = 2;
        if (historyPoints > 91) {
            historyMark = 5;
        } else if (historyPoints > 73) {
            historyMark = 4;
        } else if (historyPoints > 60) {
            historyMark = 3;
        }
        System.out.println("Оценка по истории - " + historyMark);

        int programmingMark = 2;
        if (programmingPoints > 91) {
            programmingMark = 5;
        } else if (programmingPoints > 73) {
            programmingMark = 4;
        } else if (programmingPoints > 60) {
            programmingMark = 3;
        }
        System.out.println("Оценка по программированию - " + programmingMark);

        double avgMark = (double) (historyMark + programmingMark) / 2;
        System.out.println("Средний балл оценок по предметам - " + avgMark);
        double avgPoints = (double) (historyPoints + programmingPoints) / 2;
        System.out.println("Средний % по предметам - " + avgPoints);

        System.out.println("\nЗадача 8. Расчет годовой прибыли");
        int sale = 13_000;
        int rent = 5_000;
        int costPrice = 9_000;
        int monthsCount = 12;
        int totalProfit = (sale - rent - costPrice) * monthsCount;
        System.out.print("Прибыль за год: ");

        if (totalProfit > 0) {
            System.out.print("+ ");
        } 

        System.out.println(totalProfit + " руб.");
    }
}