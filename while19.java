import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = 0, m = 0, r = 0;

        while (n > 0){

            k++;
            m = n % 10;
            r = r + m;
            n = n / 10;

        }

        System.out.println(r+" "+k);





    }

}
