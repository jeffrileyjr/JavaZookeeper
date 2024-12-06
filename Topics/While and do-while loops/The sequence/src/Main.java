import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int maxResult = 0;
        while (elements > 0) {
            int i = scanner.nextInt();
            if ((i % 4) == 0 && (i > maxResult)) {
                maxResult  = i;
            }
            elements--;
        }
        System.out.println(maxResult);
    }
}