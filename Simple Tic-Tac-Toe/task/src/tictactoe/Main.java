package tictactoe;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbols = scanner.next();
        String dashes = "---------";
        System.out.println(dashes);
        for (int i = 0; i < 3; i++) {
            String line = "| ";
            for (int j = 0; j < 3; j++) {
                line += symbols.charAt(j + 3 * i) + " ";
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println(dashes);
    }
}
