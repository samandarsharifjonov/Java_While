import java.util.Scanner;

public class while22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;

        while ((i < n - 1) && ( n % i) != 0){
            i++;
        }
        if (n % i != 0){
            System.out.println("tub");
        }else {
            System.out.println("tub emas");
        }


}

}
