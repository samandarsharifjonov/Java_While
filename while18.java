import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), teskari = 0;

        while (n > 0 ){
            teskari = teskari * 10 + n % 10;
            n /= 10;
        }

        System.out.println(teskari);


    }
}
