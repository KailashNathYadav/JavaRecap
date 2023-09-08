package JavaCollection.List;
import java.util.*;

public class JavaVector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(2);
        vec.add(3);
        vec.add(0,3);
        vec.set(0,1);
        vec.remove(2);
        System.out.println(vec);
    }

}
