import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10ExtractWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.print("Enter a string: ");
        String input = scn.nextLine();
        
        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
			System.out.printf("%s ", matcher.group());
		}

	}

}
