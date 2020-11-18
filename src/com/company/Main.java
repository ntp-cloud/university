package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Задача №1. Дан массив размера N. Вывести его элементы в обратном порядке*/
        int [] arr;
       //считываем данные, которые пользователь введет с клавиатуры
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        /*проверяем введенную размерность массива*/
        try {
            int arrSize = Integer.parseInt(s.trim());
            /*получили размер массива и создали его*/
            arr = new int [arrSize];
            /*заполним массив рандомными значениями*/
            for (int i =0; i < arr.length; i++){
                /*числа генерируются в диапазоне [-10;10]*/
                arr[i] = ((int)(Math.random() * 20) - 10);
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            /*выполняем reverse - суть в том, что мы не будем использовать вспомогательный массив для хранения данных, а будем использовать переменную temp
            * а так же будем проходить половину массива
            * */
            int temp;
            for (int j = 0; j < arrSize/2; j++) {
                temp = arr[arrSize - j - 1];
                arr[arrSize - j - 1] = arr[j];
                arr[j] = temp;
            }
            System.out.println("Reversed array: " + Arrays.toString(arr));
        } catch (NumberFormatException e){
            /*получаем нашу ошибку - если введено не число, а непонятно что: набор символов и т.д.*/
            System.out.println(("NumberFormatException: " + e.getMessage()));
            System.out.println("Please, enter a number, not a " + s);
        }
    }
}
