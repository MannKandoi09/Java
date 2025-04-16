//Track employee attendance for the day.

import java.util.ArrayList;
import java.util.List;

class EmployeeAtt{
    String employeName;
    Boolean isPresent;

    public EmployeeAtt(String employeName, Boolean isPresent) {
        this.employeName = employeName;
        this.isPresent = isPresent;
    }
}
public class EmployeAttandance {
    public static void main(String[] args) {
        List<EmployeeAtt> attendance = new ArrayList<>();
        attendance.add(new EmployeeAtt("Mann", true));
        attendance.add(new EmployeeAtt("Meet", false));
        attendance.add(new EmployeeAtt("Manav", false));
        attendance.add(new EmployeeAtt("Om", true));

        for (EmployeeAtt e : attendance){
            String status = e.isPresent ? "Present" : "Absent";
            System.out.println("Employe: " + e.employeName + " ,Status: " + status);

        }


    }
}
