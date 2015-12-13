import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class _02AllCapitals {

	public static void main(String[] args) {
		File file = new File("resources/lines.txt");
		List<String> result = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {			
			String line;
			
			while ((line = br.readLine()) != null) {				
				result.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
			for (String line : result) {
				line = line.toUpperCase();				
				pw.write(line);
				pw.write(System.lineSeparator());
			}			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
