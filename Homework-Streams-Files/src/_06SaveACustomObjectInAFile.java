import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _06SaveACustomObjectInAFile {

	private static final File FILE = new File("resources/course.save");
	
	public static void main(String[] args) {		
		
		Course course = new Course("Java", 42);
		Course courseFromFile = new Course();
		
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(FILE))) {			
			oos.writeObject(course);			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(FILE))) {
			courseFromFile = (Course) ois.readObject();				
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		
		System.out.println(course);
		System.out.println(courseFromFile);
	}	
	
}

@SuppressWarnings("serial")
class Course implements Serializable {
	
	private String name;
	private int numberOfStudents;
	
	public Course(String name, int numberOfStudents) {			
		this.name = name;
		this.numberOfStudents = numberOfStudents;
	}
	
	public Course() {
		
	}

	@Override
	public String toString() {
		return String.format("Cource -> %s, number of students: %d",
				name, numberOfStudents);
	}
}
