import java.util.Scanner;

public class _06ConvertFromBase7ToDecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter an integer in base 7 system: ");
        int numInBase7 = Integer.parseInt(scn.nextLine(), 7);
        
        String numInDecimal = Integer.toString(numInBase7, 10);
        System.out.println(numInDecimal);
	}

}
