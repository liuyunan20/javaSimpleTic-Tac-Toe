import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridge = scanner.nextInt();
        int n = 1;
        for (int i = 0; i < bridge; i++) {
            if (height >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + n);
                break;
            }
            n++;
        }
        if (n > bridge) {
            System.out.println("Will not crash");
        }
    }
}