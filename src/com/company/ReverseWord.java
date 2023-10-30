package com.company;

public class ReverseWord {
    public static void main(String[] args){
        String input = args[0];
        int inputSize=input.length();
        for(int i=inputSize-1; i>=0; i--){
            System.out.print(input.charAt(i));
        }
    }
}
