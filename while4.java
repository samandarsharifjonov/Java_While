import java.util.Scanner;

public class while4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); int c = 1;

       while (n>c){
           c = c * 3;
       }

       if ( c == n){
           System.out.println("3 ning darajasi");
       }else {
           System.out.println("3 ning darajasi emas");
       }




    }

}
