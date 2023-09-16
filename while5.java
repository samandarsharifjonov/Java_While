import java.util.Scanner;

public class while5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;
        int i = 0;

        while (n > c){

            c = c * 2;
            i++;
        }

        System.out.println(i);
    }
}
