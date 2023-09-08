package Modifier.AccessModifier.package1;

public class SameClass{
    // default - with same package.
	// public - everywhere
    // private - within the class.
	// protected - within same package or subclass of different package.
    // Note: cannot make a static reference to the non-static field
	static int defaultAtt = 1;
	public static float publicAtt = 1.0F;
	private static char privateAtt = 'c';
	protected static boolean protectedAtt = true;
	public static void main(String[] args) {
		System.out.println(defaultAtt);
		System.out.println(publicAtt);
		System.out.println(privateAtt);
		System.out.println(protectedAtt);
	}
}