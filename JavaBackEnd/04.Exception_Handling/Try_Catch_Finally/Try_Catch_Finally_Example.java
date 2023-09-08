public class Try_Catch_Finally_Example{
	public static void main(String[] args) {
		String h = "Hello";
		//Why finally is used ............. => close the allocated resource.
		try {
			System.out.println(h.charAt(5));
			System.out.println("I am not going to be executed.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally: No matter what , I am going to be executed.");
		}
	}
}