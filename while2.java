import java.util.Scanner;

public class while2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;

        while ( a >= b){
            a = a - b;
            s++;
        }

        System.out.println(s);



    }

}
