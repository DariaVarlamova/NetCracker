package com.company;

public class Main {

    public static void main(String[] args) {
        String str0 = "This is a first row";
        String str1 = "This is a second row";
        String str2 = "This is a third row";

        String[] array  = {str0, str1, str2};
        print(array);
    }

    public static void print(String[] mas){
        for (int i=0; i < mas.length; i++)
        System.out.println(mas[i] + " ");
        System.out.println("\n");
    }
}
