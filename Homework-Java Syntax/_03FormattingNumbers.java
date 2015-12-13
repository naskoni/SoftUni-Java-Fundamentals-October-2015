import java.util.Locale;
import java.util.Scanner;

public class _03FormattingNumbers {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        scn.useLocale(Locale.ENGLISH);

        System.out.println("Enter an integer a (0 ? a ? 500): ");
        int a = scn.nextInt();

        System.out.println("Enter a floating-point b: ");
        double b = scn.nextDouble();

        System.out.println("Enter a floating-point c: ");
        double c = scn.nextDouble();

        String aHex = Integer.toHexString(a).toUpperCase();
        String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aHex, aBin, b, c);
    }
}
