import java.util.Scanner;

public class RefactorVolumePyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = 0;
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        v = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", v);

    }
}
