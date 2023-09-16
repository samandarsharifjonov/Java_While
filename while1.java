import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a >= b){
            a = a - b;
        }
        System.out.println(a);
    }
}