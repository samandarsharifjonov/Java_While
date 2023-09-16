import java.util.Scanner;

public class while10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 1;
        while (Math.pow(3,k)<=n){
            k++;
        }
        System.out.println(k-1);
    }
}
