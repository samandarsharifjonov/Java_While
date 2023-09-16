import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;

        while (n>=k*k){
            k++;
        }
        System.out.println(k-1);



    }
}
