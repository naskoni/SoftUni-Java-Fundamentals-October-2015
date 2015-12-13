import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _14SortArrayWithStreamAPI {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		
		List<Integer> numbers = Stream.of(scn.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		String order = scn.nextLine();
		
		if (order.equals("Ascending")) {
			numbers.stream()
						.sorted((n1, n2) -> n1.compareTo(n2))
						.forEach(n -> System.out.print(n + " "));
		} else {
			numbers.stream()
						.sorted((n1, n2) -> n2.compareTo(n1))
						.forEach(n -> System.out.print(n + " "));
		}

	}

}
