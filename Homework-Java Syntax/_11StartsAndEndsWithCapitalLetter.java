import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11StartsAndEndsWithCapitalLetter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.print("Enter a string: ");
        String input = scn.nextLine();
        
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
        	System.out.printf("%s ", matcher.group());			
		}        				
	}

}
