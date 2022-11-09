package com.max.idea;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку");

        String str = input.nextLine();
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[A-Za-z]+")) {
                result = result + words[i] + " ";
            }
        }

        System.out.println("Слова, состоящие только из латиницы");
        System.out.println(result);
        System.out.println("Kоличество этих слов");
        System.out.println(result.split(" ").length);
    }
}
