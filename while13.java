import java.util.Scanner;

public class while13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat(), sum = 0, k = 0;

        while (sum <= n){
            k++;
            sum+=(1/k);

        }
        System.out.println(k+" "+sum);


    }
}
