package com.company;

public class Main {

    public static void main(String[] args) {
        String str0 = "First row";
        String str1 = "Second row";
        String str2 = "Third row";
        String[] array  = {str0, str1, str2};
        sort(array);
        print(array);
    }

    public static void print(String[] mas){
        for (int i=0; i < mas.length; i++)
        System.out.println(mas[i] + " ");
        System.out.println("\n");
    }

    public static void sort(String[] mas){
        String sortedA;
        for (int i=0; i < mas.length; i++){
            for (int j = 1; j < mas.length; j++){
                if (mas[i].compareTo(mas[j]) < 0){
                    sortedA = mas[j];
                    mas[j] = mas[i];
                    mas[i] = sortedA;
                }
            }
        }
    }
}