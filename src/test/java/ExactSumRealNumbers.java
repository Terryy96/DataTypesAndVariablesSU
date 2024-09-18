import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumRealNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        BigDecimal sum =BigDecimal.ZERO;

        for (int i = 1; i <=n ; i++) {
            BigDecimal number = scanner.nextBigDecimal(); // Read the next number as BigDecimal
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
