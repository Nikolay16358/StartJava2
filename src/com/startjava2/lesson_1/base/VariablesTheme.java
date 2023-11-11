package com.startjava2.lesson_1.base;

public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("Задача 1. Вывод характеристик компьютера");
        byte cpu = 5;
        System.out.println("Процессор Intel Core i" + cpu);
        short windowsVersion = 10;
        System.out.println("Версия Windows " + windowsVersion + " PRO");
        int systemType = 64;
        System.out.println(systemType + " - разрядная операционная система");
        long memoryOnDiskC = 237L;
        System.out.println("Свободной памяти на диске С осталось " + memoryOnDiskC + " ГБ");
        float cpuFrequency = 2.40f;
        System.out.println("Частота процессора " + cpuFrequency + " ГГц");
        double ram = 8.00;
        System.out.println("Оперативная память составляет " + ram + " ГБ");
        char cpuSymbol = 'i';
        System.out.println("Процессор Intel Core " + cpuSymbol + cpu);
        boolean isWindows = true;
        if (isWindows) {
            System.out.println("На этом компьютере установлена операционная система Windows");
        }

        System.out.println("\nЗадача 2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        double discount = 0.11;
        int totalCost = penCost + bookCost;
        double totalDiscount = totalCost * discount;
        double totalDiscountCost = totalCost - totalDiscount;
        System.out.println("Стоимость товаров без скидки - " + totalCost + " руб.\nСумма скидки - "
                + (int) totalDiscount + " руб.\nСтоимость товаров со скидкой " + 
                + (int) totalDiscountCost + " руб.");

        System.out.println("\nЗадача 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a     \nJ  J  aaaaa" +
                "  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.println("Byte: " + maxByte + ", " + ++maxByte + ", " + --maxByte);
        System.out.println("Short: " + maxShort + ", " + ++maxShort + ", " + --maxShort);
        System.out.println("Int: " + maxInt + ", " + ++maxInt + ", " + --maxInt);
        System.out.println("Long: " + maxLong + ", " + ++maxLong + ", " + --maxLong);

        System.out.println("\nЗадача 5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.print("Исходные значения переменных " + num1 + " и " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println(". Метод использования третьей переменной. Новые значения переменных " + 
                num1 + " и " + num2);
        System.out.print("Исходные значения переменных " + num1 + " и " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println(". Метод использования арифметических операций. Новые значения переменных "
                + num1 + " и " + num2);
        System.out.print("Исходные значения переменных " + num1 + " и " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(". Метод побитовой операции. Новые значения переменных " + num1 + " и " +
                num2);

        System.out.println("\nЗадача 6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\nЗадача 7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + 
                leftParenthesis + " " + rightParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + 
                slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\nЗадача 8. Вывод количества сотен, десятков и единиц числа");
        num1 = 123;
        int hundreads = num1 / 100;
        int tens = (num1 % 100) / 10;
        int ones = num1 % 10;
        int sum = hundreads + tens + ones;
        int multiplication = hundreads * tens * ones;
        System.out.println("Число " + num1 + " содержит:\n сотен - " + hundreads + 
                "\n десятков - " + tens + "\n единиц - " + ones + "\nСумма его цифр - " + sum +
                "\nПроизведение его цифр - " + multiplication);

        System.out.println("\nЗадача 9. Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}