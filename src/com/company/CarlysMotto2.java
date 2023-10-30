package com.company;

public class CarlysMotto2 {
    public static void main(String[] args) {
        boxString("Carly's makes the food that makes it a party.");
    }

    public static void boxString(String contents){
        int n=contents.length();
        for (int i=0; i<n+2; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.println("*" + contents + "*");

        for (int i=0; i<n+2; i++){
            System.out.print("*");
        }

        System.out.println();
    }
}