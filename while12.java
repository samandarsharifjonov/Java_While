import java.util.Scanner;

public class while12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0, k = 0;

        while (sum < n){
            k++;
            sum+=k;
        }
        if (sum > n ) sum -= k--;
        System.out.println(k+" "+sum);

    }
}
