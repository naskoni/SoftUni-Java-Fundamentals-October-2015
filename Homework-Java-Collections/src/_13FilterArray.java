import java.util.Arrays;
import java.util.Scanner;

public class _13FilterArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		
		String[] strings = scn.nextLine().split(" ");
		
		Arrays.asList(strings).stream()
				.filter(s -> s.length() > 3)
				.forEach(s -> System.out.print(s + " "));
	}

}
