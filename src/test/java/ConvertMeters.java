import java.util.Scanner;

public class ConvertMeters {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int km= Integer.parseInt(scanner.nextLine());
        double m= (double) km/ 1000;

        System.out.printf("%.2f", m);

    }
}
