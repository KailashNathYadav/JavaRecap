/*
Operator : Arithmetic, Relational , Logical , Bitwise , Unary 
*/ 
public class JavaOperator {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 3;
        System.out.printf("a = %d  , b = %d \n",a,b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators == != < > <= >=

        // Logical operators && || !
        
        // Uniary operators
        int c = 10 ;
        System.out.printf("c = %d\n", c);
        System.out.println("Postincrement of c : " + (c++));
        System.out.println("Preincrement of c : " + (++c));
        System.out.println("Postdecrement of c : " + (c--));
        System.out.println("Predecrement of c: " + (--c));

        // Bitwise operators
        int d = 0b1010 , e = 0b1100;
        System.out.println("d = 0b1010 , e = 0b1100");
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}
