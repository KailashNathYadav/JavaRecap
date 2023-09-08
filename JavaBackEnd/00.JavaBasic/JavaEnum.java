public class JavaEnum {
    enum Status{
        Running, Failed, Pending, Success;
    }
    // datatype for named constant.
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s);
    }
}
