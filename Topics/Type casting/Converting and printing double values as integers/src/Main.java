import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        double n = scanner.nextDouble();

        // Convert and print the number to an integer.

        int intNum = (int) n;
        System.out.println(intNum);

        scanner.close();
    }
}