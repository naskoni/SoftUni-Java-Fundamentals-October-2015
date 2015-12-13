import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _07RandomizeNumbersFromNToM {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.println("Enter an integer N: ");
        int n = scn.nextInt();
        System.out.println("Enter an integer M: ");
        int m = scn.nextInt();
        
        if (n == m) {
			System.out.println(n);
		} else {
			if (n > m) {
				int temp = n;
				n = m;
				m = temp;
			}
			List<Integer> numbers = new ArrayList<>();
			for (int i = n; i <= m; i++) {
				numbers.add(i);
			}
			
			Collections.shuffle(numbers);
			
			for (Integer integer : numbers) {
				System.out.printf("%d ", integer);
			}
		}

	}

}
