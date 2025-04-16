//Track multiple students with name, roll no, and marks.

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int roll;
    int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}


public class StudentRecord {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mann", 1, 88 ));
        students.add(new Student("Manthan", 2, 80));

        for (Student s : students){
            System.out.println("Name:" + s.name + " Roll:" + s.roll + " Marks:" + s.marks);
        }


    }
}
