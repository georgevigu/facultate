package MiddleCharacter;
import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti string-ul");

        String input = myObj.nextLine();
        int inputSize = input.length();
        if (inputSize % 2 == 1) {
            System.out.println(input.charAt(inputSize/2));
        }
        else {
            System.out.println(input.charAt(inputSize/2 - 1) + "" + input.charAt(inputSize/2));
        }
    }
}
