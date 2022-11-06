package com.max.idea;
import java.util.Scanner;

public class Задача_6_Операторы {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Integer result = scanner.nextInt();
        switch (result) {
            case 2:
                result = 2;
                System.out.println("выбрано расстояние");
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                Integer result1 = scanner.nextInt();
                switch (result1) {
                    case 1:
                        result1 = 1;
                        System.out.println("выбран метр");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result3 = scanner.nextInt();
                        double мили = result3 * 0.000621371;
                        double ярды = result3 * 1.09361;
                        double футы = result3 * 3.28;
                        System.out.println("результат: " + "Метры: " + result3 + "  Мили: " + мили + "  Ярды: " + ярды + "  Футы: " + футы);
                        break;
                    case 2:
                        result1 = 2;
                        System.out.println("выбрана миля");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result4 = scanner.nextInt();
                        double metr2 = result4 * 1609.34;
                        double aird2 = result4 * 1760;
                        double fut2 = result4 * 5280;
                        System.out.println("результат: " + "Мили " + result4 + "  Метры: " + metr2 + "  Ярды: " + aird2 + "  Футы: " + fut2);
                        break;
                    case 3:
                        result1 = 3;
                        System.out.println("выбран ярд");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result5 = scanner.nextInt();
                        double mili3 = result5 * 0.000568182;
                        double metr3 = result5 * 0.9144;
                        double fut3 = result5 * 0.333333;
                        System.out.println("результат: " + "Ярды: " + result5 + "  мили: " + mili3 + "  Метры: " + metr3 + "  Футы: " + fut3);
                        break;
                    case 4:
                        result1 = 4;
                        System.out.println("выбран фут");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result6 = scanner.nextInt();
                        double mili4 = result6 * 0.000189394;
                        double aird4 = result6 * 0.333333;
                        double metr4 = result6 * 0.3048;
                        System.out.println("результат: " + "Футы: " + result6 + "  Мили: " + mili4 + "  Ярды: " + aird4 + "  Метры: " + metr4);
                        break;
                }
                break;
            case 1:
                result = 1;
                System.out.println("выбрана масса");
                System.out.println("Выберите единицу измерения: 1 - киллограмм, 2 - грамм");
                Integer result7 = scanner.nextInt();
                switch (result7) {
                    case 1:
                        result1 = 1;
                        System.out.println("выбран киллограмм");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result8 = scanner.nextInt();
                        double грамм = result8 * 1000;

                        System.out.println("результат: " + "киллограмм: " + result7 + "  грамм: " + грамм);
                        break;
                    case 2:
                        result1 = 2;
                        System.out.println("выбран грамм");
                        System.out.println("ввести количество выбранных единиц");
                        Integer result9 = scanner.nextInt();
                        double киллограмм = result9 * 0.001;
                        System.out.println("результат: " + "грамм " + result9 + "  киллограмм: " + киллограмм);
                        break;
                }
        }
    }
}