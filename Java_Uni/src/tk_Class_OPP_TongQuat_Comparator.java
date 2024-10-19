import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class tk_Class_OPP_TongQuat_Comparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 22));
        students.add(new Student("Lisa", 18));
        students.add(new Student("Tom", 20));

        System.out.println("Sắp xếp theo tuổi:");
        Collections.sort(students, new AgeComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Sắp xếp theo tên:");
        Collections.sort(students, new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
