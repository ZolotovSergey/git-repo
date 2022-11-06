package com.max.idea;

public class Задача_3_Массивы {
    public static void main(String[] args) {
        System.out.println("Задача №3_Массивы");
        int[] nums = {1,2,3,4,5};
        System.out.println("Задайте массив из 5 любых целых чисел: " + nums[0] + nums[1] + nums[2] + nums[3] + nums[nums.length - 1]);
                int a = nums[0];
                nums[0] = nums[nums.length - 1];
                nums[nums.length - 1] = a;
        System.out.println("Поменяйте местами первый и последний элемент в массиве: " + nums[0] + nums[1] + nums[2] + nums[3] + nums[nums.length - 1]);
        int sum = nums[0] + nums[nums.length/2];
        System.out.println("Вывести в консоль результат суммы первого и среднего элемента: " + sum);



    }
}
