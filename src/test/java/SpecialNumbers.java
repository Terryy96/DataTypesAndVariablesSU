import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int digits = i;
            int sumDigits=0;


            while (digits>0){
                sumDigits+=digits%10;
                digits=digits/10;
            }

            if (sumDigits==5 || sumDigits==7 || sumDigits==11){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
