import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _13GetFirstOddOrEvenElements {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.print("Enter some integers, separated by a space: ");
        String[] numbers = scn.nextLine().split(" ");
        System.out.print("Enter command: ");
        String[] command = scn.nextLine().split(" ");
        
        int[] numArr = new int[numbers.length];
        for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(numbers[i]);
		}
        
        int countLimit = Integer.parseInt(command[1]);
        String oddEven = command[2];        
        List<Integer> result = new ArrayList<>();            
        
        if(oddEven.equals("odd")) {
        	for (int i = 0, count = 0; i < numArr.length; i++) {			
				if (numArr[i] % 2 != 0) {
					result.add(numArr[i]);
					count++;
				}
				if (count == countLimit) {
					break;
				}
			}
        	
		} else if(oddEven.equals("even")) {
			for (int i = 0, count = 0; i < numArr.length; i++) {			
				if (numArr[i] % 2 == 0) {
					result.add(numArr[i]);
					count++;
				}
				if (count == countLimit) {
					break;
				}
			}
		}
        
        for (Integer integer : result) {
        	System.out.print(integer + " ");
		}

	}

}
