import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(Comparator.comparingInt(o -> o.mark));
        students.add(new Student("Lala", 2));
        students.add(new Student("Lala", 3));
        students.add(new Student("Lala", 4));
        students.add(new Student("Lala", 5));
        students.add(new Student("Lala", 5));
        students.add(new Student("Lala", 3));
        students.add(new Student("Lala", 2));

        Set<Student> set = students.tailSet(new Student(" ", 3), false);
        for (Student s : set) {
            System.out.println(s.mark);
        }
    }
}
class Student {


    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

}