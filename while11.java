import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 0, sum = 0;

        while (sum < n){
            k++;
            sum += k;
        }
        System.out.println(k+" "+sum);

    }
}

