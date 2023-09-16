import java.util.Scanner;

public class while30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = 0;
        int Q = 0;

        while (b-c > 0){
            k++;
            b -= c;
        }
        while (a-c > 0){

            Q++;
            a -= c;
        }
        System.out.println(Q*k);
    }
}
