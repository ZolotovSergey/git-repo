package com.max.idea;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class kontr1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара");
        double kr = scanner.nextDouble ();;
        System.out.println("количество рублей");
        double kol = scanner.nextDouble ();;
        double value = kol / kr;
        BigDecimal result = new BigDecimal(value);
        result = result.setScale(2, RoundingMode.DOWN);
        System.out.println(result +" долларов");


    }
}
