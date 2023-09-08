package JavaCollection.Set;
import java.util.*;

public class JavaTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(5);ts.add(7);ts.add(1);ts.add(6);
		System.out.println(ts);
		ts.remove(7);
		System.out.println(ts);
		System.out.println(ts.contains(6));
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
    }
}
