import java.util.Scanner;

public class while9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 0;

        while (Math.pow(3,k) <= n){
             k++;
        }
        System.out.println(k);









    }
}
