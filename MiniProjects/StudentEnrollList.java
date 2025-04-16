//Track student enrollments and their enrolled courses.

import java.util.ArrayList;
import java.util.List;

class Enrollment{
    String studentName;
    String courseName;

    public Enrollment(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }
}



public class StudentEnrollList {
    public static void main(String[] args) {
        List<Enrollment> enroll = new ArrayList<>();
        enroll.add(new Enrollment("Mann", "Java_Programming"));
        enroll.add(new Enrollment("Meet", "Web_Devlopment"));
        enroll.add(new Enrollment("Om", "DataStructure"));

        for (Enrollment e : enroll){
            System.out.println("Student: " + e.studentName + " has Enrolled in: " + e.courseName);
        }

    }
}
