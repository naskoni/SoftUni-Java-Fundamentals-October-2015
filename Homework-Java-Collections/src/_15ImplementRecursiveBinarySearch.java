import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _15ImplementRecursiveBinarySearch {	

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        
        List<Integer> sortedNumbers = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        int numberIndex = binarySearch(sortedNumbers, number, 0, sortedNumbers.size() - 1);
        System.out.println(numberIndex);

    }

    private static int binarySearch(List<Integer> list, int n, int start, int end) {

        if (end < start) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (list.get(middle) < n) {
            return binarySearch(list, n, middle + 1, end);
        }

        if (list.get(middle) > n) {
            return binarySearch(list, n, start, middle - 1);
        }

        return middle;
    }

}
