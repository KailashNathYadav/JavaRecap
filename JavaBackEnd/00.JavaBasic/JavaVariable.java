/* 
comment : single line , multi-line , document
Print: print() , println() , printf()
Java_Life_Cycle: JDK , JRE , JVM , JIT
Variable: hold the value.
Naming_Conventions: Pascal , Camel , Snake 
*/ 
class JavaVariable{
    public static void main(String[] args) {
        /** Primitive DT: byte , short , int , long [1,2,4,8L]
        float , double [4F , 8]
        char , boolean */
		System.out.print("Random Value ");
		System.out.printf("\n%s \n","MIN_VALUE");
		System.out.println("MAX_VALUE");

        byte b1 = 10;
		System.out.println(b1);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		short s1 = 10;
		System.out.println(s1);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		int i1 = 10;
		System.out.println(i1);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		long lg1 = 1_77_000L; //e 
		System.out.println(lg1);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		float f1 = 1.2485145f;
		System.out.println(f1);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		double d1 = 1.23575;
		System.out.println(d1);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

        char c1 = '\'';
        System.out.println(c1);

		boolean b2 = false;
		System.out.println(b2);
    }
}