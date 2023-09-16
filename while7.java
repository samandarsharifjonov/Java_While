import java.util.Scanner;

public class while7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),s=0;
        while (n>=s*s){
            s++;
            if (s*s>n) System.out.println(s);
        }

    }
}
