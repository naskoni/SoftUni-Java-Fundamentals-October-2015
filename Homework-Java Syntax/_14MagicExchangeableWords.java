import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _14MagicExchangeableWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.print("Enter two strings with equal lenght, separated by a space: ");
        String[] input = scn.nextLine().split(" ");        
        String str1 = input[0];
        String str2 = input[1];
        
        Map<Character, Character> map = new HashMap<>();
        boolean isKeyMappedWithOtherValue = false;
        
        for (int i = 0; i < str1.length(); i++) {
        	char c1 = str1.charAt(i);
        	char c2 = str2.charAt(i);
        	
			if (map.containsKey(c1)) {
				if (map.get(c1) != c2) {
					isKeyMappedWithOtherValue = true;
					break;
				}
			} else {
				if (map.containsValue(c2)) {
					isKeyMappedWithOtherValue = true;
					break;
				}
				map.put(c1, c2);
			}
		}
        
        System.out.println(!isKeyMappedWithOtherValue);

	}

}
