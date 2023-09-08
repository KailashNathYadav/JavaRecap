import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    public int age;
    public String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }
    
}

public class ComparableExample {
    public static void main(String[] args) {
        //Sort the student on the basis of age in increasing order.
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"Ayan"));
        students.add(new Student(23,"Satyam"));
        students.add(new Student(34, "peterson"));
        students.add(new Student(34, "Navin"));
        students.add(new Student(18, "Kane Williamson"));

        System.out.println("List of student");
        students.forEach(student -> System.out.println(student));
        Collections.sort(students);
        System.out.println("Sorted List of student on the basis of age");
        students.forEach(student -> System.out.println(student));
    }
}
