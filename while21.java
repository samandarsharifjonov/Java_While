import java.util.Scanner;

public class while21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean i = (false);
        int r = 0, m = 0, k = 0;

        while ( n >= 2){
            m = ( n % 10);
            n/=10;

            if ( m % 2 != 0) i = true;
        }

        if (i) System.out.println("bor");
        else System.out.println("yo'q");

    }


}
