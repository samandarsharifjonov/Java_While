import java.util.Scanner;

public class while15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float s = scanner.nextFloat();
        float p = scanner.nextFloat();
        float sum = s, k = 0;
        while (sum/s < 2){
            k++;
            sum = sum + sum * (p/100);
        }
        System.out.println(k+" "+sum);

    }
}

