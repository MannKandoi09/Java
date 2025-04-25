import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

//Inserting Query into MySQL With Java
public class Conn2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/ConnectionPractice";
        String name = "root";
        String password = "mann5112";
        try{
            //Checking if Connection is Done or Not
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Done");

            //Inserting Multiple Row:-
            String query = "INSERT INTO Persons(ID, Name, Age) VALUES (?,?,?)";
            PreparedStatement prep = con.prepareStatement(query);

            prep.setInt(1,101); //1 is index of row and 101 is value in that row
            prep.setString(2,"Mann"); // 2 is index of row and mann is value of row
            prep.setInt(3,20); // 3 is index of row and 20 is value of row
            prep.addBatch();
            //Row 1 Inserted

            prep.setInt(1,102); //1 is index of row and 102 is value in that row
            prep.setString(2,"Dev"); // 2 is index of row and Dev is value of row
            prep.setInt(3,23); // 3 is index of row and 23 is value of row
            prep.addBatch();

            //Executing
            int[] result = prep.executeBatch();
            System.out.println("Inserted " + result.length + " Records SuccessFully");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
