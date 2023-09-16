import java.util.Scanner;

public class while24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;

        while (n != f3 && n > f3) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }

        if (n == f3 || n == 1) {
            System.out.println("bor");
        } else {
            System.out.println("yo'q");
        }

    }
}
