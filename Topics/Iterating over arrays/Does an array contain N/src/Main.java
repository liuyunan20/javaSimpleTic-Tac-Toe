import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int keyNum = scanner.nextInt();
        boolean res = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == keyNum) {
                res = true;
                break;
            }
        }
        System.out.println(res);
    }
}