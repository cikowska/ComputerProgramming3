import java.util.Scanner;

public class ScanTest
{
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String results = "";
        System.out.println("Provide a list of integers, stop by providing a non-integer character");
        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            results += x + ",";
        }
        System.out.println(results);
    }
}
