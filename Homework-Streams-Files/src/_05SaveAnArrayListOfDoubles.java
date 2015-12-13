import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05SaveAnArrayListOfDoubles {

	private static final File FILE = new File("resources/doubles.list");
	
	public static void main(String[] args) {		
		
		List<Double> listOfDoubles = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
		List<Double> listFromFile = new ArrayList<>();
		int count = listOfDoubles.size();
		
		saveList(listOfDoubles);
		loadList(listFromFile, count);
		
		System.out.println(listOfDoubles);
		System.out.println(listFromFile);		
	}	

	private static void loadList(List<Double> listFromFile, int count) {
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(FILE))) {
			for (int i = 0; i < count; i++) {
				listFromFile.add(ois.readDouble());
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
	}

	private static void saveList(List<Double> listOfDoubles) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(FILE))) {
			for (Double element : listOfDoubles) {
				oos.writeDouble(element);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}

}
