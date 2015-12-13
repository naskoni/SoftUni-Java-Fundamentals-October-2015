import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04CopyJpgFile {

	public static void main(String[] args) {
		File inputFile = new File("resources/java-glasses.jpg");
		File outputFile = new File("resources/my-copied-picture.jpg");
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[4096];
			int returnedBytes;
			
			while ((returnedBytes = fis.read(buffer, 0, buffer.length)) != -1) {
				fos.write(buffer, 0, returnedBytes);				
			}		
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened!");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
