import java.util.Scanner;

public class while27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        int k = 1;

        while ( n >= f3){
            k++;
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(k);
    }

}
