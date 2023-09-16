import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, r = 0, m;
        boolean i = false;
        while (n > 0){

            m = n % 10;
            n /= 10;

            if ( m == 2) i = true;
        }

        if (i) System.out.println("bor");
        else System.out.println("yo'q");


    }
}
