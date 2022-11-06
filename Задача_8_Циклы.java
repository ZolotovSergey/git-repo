package com.max.idea;
import java.util.Scanner;

public class Задача_8_Циклы {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            if (i % 2 !=0) sum = sum + i;
        }
        System.out.println (sum);
    }
}


