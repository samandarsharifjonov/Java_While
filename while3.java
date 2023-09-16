import java.util.Scanner;

public class while3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int s = 0;


        while ( n >= k){

            n = n - k;
            s++;

        }

        System.out.println(s+" "+n);




    }

}
