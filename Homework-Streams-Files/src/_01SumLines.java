import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _01SumLines {

	public static void main(String[] args) {
		File file = new File("resources/lines.txt");
		List<Integer> result = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {			
			String line;
			
			while ((line = br.readLine()) != null) {
				int currSum = 0;
				
				for (int i = 0; i < line.length(); i++) {
					currSum += line.charAt(i);
				}
				
				result.add(currSum);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

}
