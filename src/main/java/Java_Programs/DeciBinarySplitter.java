package Java_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeciBinarySplitter {
    public static List<String> splitToDeciBinary(String n) {
        List<String> result = new ArrayList<>();
        char[] digits = n.toCharArray();

        while (!n.equals("0")) {
            StringBuilder layer = new StringBuilder();
            StringBuilder next = new StringBuilder();

            for (char c : digits) {
                if (c > '0') {
                    layer.append('1');
                    next.append((char)(c - 1));
                } else {
                    layer.append('0');
                    next.append('0');
                }
            }

            result.add(layer.toString());
            n = next.toString();
            digits = n.toCharArray();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        List<String> deciBinaryParts = splitToDeciBinary(input);
        System.out.println("Deci-binary parts:");
        for (String part : deciBinaryParts) {
            System.out.print(part + " ");
        }
    }
}
