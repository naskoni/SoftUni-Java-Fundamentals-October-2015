import java.util.Scanner;

public class _05ConvertFromDecimalSystemToBase7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter an integer in decimal system: ");
        int decimalNum = scn.nextInt();
        
        String numInBase7 = Integer.toString(decimalNum, 7);
        System.out.println(numInBase7);
	}

}
