import java.util.Scanner;

public class while16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double masofa = 10;
        int kun = 0;

        while (masofa <= 200){
            masofa = masofa + (p / 100 * masofa);
            kun++;
        }
        System.out.println((int)kun +" "+(int)masofa);

    }
}
