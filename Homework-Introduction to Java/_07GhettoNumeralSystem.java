import java.util.Scanner;

public class _07GhettoNumeralSystem {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);		
		System.out.print("Enter decimal number to convert"
				+ " in ghetto numeral system: ");
		
		String number = scn.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < number.length(); i++) {
			char currDigit = number.charAt(i);
			
			switch (currDigit) {
			case '0' :
				sb.append("Gee");
				break;
			case '1' :
				sb.append("Bro");
				break;
			case '2' :
				sb.append("Zuz");
				break;
			case '3' :
				sb.append("Ma");
				break;
			case '4' :
				sb.append("Duh");
				break;
			case '5' :
				sb.append("Yo");
				break;
			case '6' :
				sb.append("Dis");
				break;
			case '7' :
				sb.append("Hood");
				break;
			case '8' :
				sb.append("Jam");
				break;
			case '9' :
				sb.append("Mack");
				break;			
			}
		}
		
		System.out.println(sb);

	}

}
