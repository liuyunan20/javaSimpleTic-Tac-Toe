import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            n = scanner.nextInt();
            length++;
        }
        System.out.println(length);
    }
}