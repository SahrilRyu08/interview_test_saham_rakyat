import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(BinaryToDecimal(scanner.next()));
//        System.out.println(DecimalToBinary(scanner.nextInt()));
////      palindrome
//        String[] text = scanner.next().split(" ");
//        System.out.println(palindrome(text));

    }

    public static int BinaryToDecimal(String number) {
        int result = 0;
        int result2 = 1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                for (int j = 0; j < i; j++) {
                    result2 *= 2;
                }
                result += result2;
                result2 = 1;
            }
        }
        return result;
    }


    public static int DecimalToBinary(int number) {
        String binary = "";
        if (number <= 0) {
            binary = "0";
        } else {
            while (number > 0) {
                binary = (number % 2) + binary;
                number /= 2;
            }
        }
        return Integer.parseInt(binary);
    }




}
