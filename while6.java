import java.util.Scanner;

public class while6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), s = 1;

        while (n > 0){

            s = s * n;
            n = n - 2;

        }

        System.out.println(s);

    }
}
