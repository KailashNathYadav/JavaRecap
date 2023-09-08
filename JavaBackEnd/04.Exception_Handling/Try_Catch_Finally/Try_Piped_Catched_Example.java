import java.util.*;

public class Try_Piped_Catched_Example{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		try {
			System.out.println("hello".charAt(sc.nextInt()));
			System.out.println(10/0);
		} catch (StringIndexOutOfBoundsException | ArithmeticException aAS) {
			System.out.println("Either arithmetic or out of bound exception.");
		}
        sc.close();
	}
}