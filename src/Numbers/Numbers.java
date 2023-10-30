package Numbers;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int number = myObj.nextInt();
        int sumaCifre = 0;
        while (number != 0) {
            sumaCifre += number % 10;
            number /= 10;
        }
        System.out.println("Suma cifrelor este " + sumaCifre);
    }
}
