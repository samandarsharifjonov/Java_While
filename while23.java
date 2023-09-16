import java.util.Scanner;

public class while23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int EKUB = a;


        while (a % EKUB != 0 || b % EKUB != 0) {
            EKUB--;
        }

        System.out.println(EKUB);

    }
}

