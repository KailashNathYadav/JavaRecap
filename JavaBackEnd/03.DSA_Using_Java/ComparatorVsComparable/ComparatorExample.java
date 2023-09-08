import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // Sort the student on the basis of name length.
        // Sort the number on the basis of last digit.

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String name1 , String name2){
                return name1.length() > name2.length() ? 1 : -1;
            }
        };

        List<String> students = new ArrayList<>();
        students.add("Ayan");
        students.add("Satyam");
        students.add("Kane Williamson");
        students.add("peterson");
        students.add("Navin");
        System.out.println("List of student before sorting");
        students.forEach(student -> System.out.println(student));
        Collections.sort(students,comp);
        System.out.println("List of student after sorting");
        students.forEach(student -> System.out.println(student));
    }
}
