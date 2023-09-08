class MyException extends Exception{
    MyException(){}
    MyException(String s){
        super(s);
    }
}

public class User_Defined_Exception_Example{
    public static void main(String[] args) throws MyException{
        throw new MyException("I am custom Exception");
    }
}
