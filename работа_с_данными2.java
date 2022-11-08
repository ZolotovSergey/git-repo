package com.max.idea;
import java.util.Scanner;

public class работа_с_данными2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Напишите программу, принимающую на вход строку “I like Java!!!”
        System.out.println("Enter your string  \"I like Java!!!\"");
        String str = scan.nextLine();
        if (str.equals("I like Java!!!")) {
            //Проверить, содержит ли строка подстроку “Java” (используйте contains()).
            boolean got = str.contains("Java");
            System.out.println("String contains \"Java\" : " + got);
            //Проверить, начинается ли строка с подстроки “I like”
            boolean start = str.startsWith("I like");
            System.out.println("String starts with \"I like\": " + start);
            //Проверить, заканчивается ли строка с подставки “!!!”
            boolean ends = str.endsWith("!!!");
            System.out.println("String ends with \"!!!\": " + ends);
            //Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
            if (got == true && start == true && ends == true) {
                String result = str.toUpperCase();
                System.out.println(result);
            }
            //Замените все символы "a" на "о" и введите подстроку "Jovo" на экран
            String rep = str.replace("a", "o");
            String result = rep.substring(7, 11);
            System.out.println(result);
        } else
            System.out.println("Your string is not equals \"I like Java!!!\"");
    }
}

