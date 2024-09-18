import java.math.BigDecimal;
import java.util.Scanner;

public class TownInfo {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String town= scanner.nextLine();
        BigDecimal population= scanner.nextBigDecimal();
       BigDecimal area= scanner.nextBigDecimal();

        System.out.printf("Town %s has population of %.0f and area %.0f square km.", town, population,area);
    }
}
