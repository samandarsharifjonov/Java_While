import java.util.Scanner;

public class while17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = 0;

        while ( n >= m){

            n = n - m;
            k++;
        }

        System.out.println(k+" "+n);


    }
}
