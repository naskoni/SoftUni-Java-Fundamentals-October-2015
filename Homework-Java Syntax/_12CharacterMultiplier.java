import java.util.Scanner;

public class _12CharacterMultiplier {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.print("Enter two strings, separated by a space: ");
        String[] input = scn.nextLine().split(" ");        
        String str1 = input[0];
        String str2 = input[1];
        
        int sum = CalcSumOfCodesMultiplied(str1, str2);
        System.out.println(sum); 
	}

	private static int CalcSumOfCodesMultiplied(String str1, String str2) {
		int sum = 0;
		int minLength = Math.min(str1.length(), str2.length());
        int maxLength = Math.max(str1.length(), str2.length());
        String longestStr = str1.length() >= str2.length() ? str1 : str2;
        
        for (int i = 0; i < minLength; i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			sum += (int)(c1 * c2);
		}
        
        for (int i = minLength; i < maxLength; i++) {
        	sum += (int)(longestStr.charAt(i));
		}
		return sum;
	}

}
