import java.io.*;

public class Try_With_Resource_Example{
	public static void main(String[] args) {
		// Why we need: less verbose act try-catch-finally.
		// \ is basically escape character
		String filePath = "D://javaTut//memo.txt";
		try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
			String content = "Welcome in the world of Kailash.";
			fileOutputStream.write(content.getBytes());
		}
		catch(IOException ioEx) {
			System.out.println("IOException" + ioEx.toString());
		}
	}
}