import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conn5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/ConnectionPractice";
        String name = "root";
        String password = "mann5112";
        try {
            Connection conn = DriverManager.getConnection(url,name,password);
            System.out.println("Successfully Connected...");

            //Deleting Query
            String q = "DELETE FROM Persons WHERE ID = ?";
            PreparedStatement prep = conn.prepareStatement(q);

            //Set ID You Want to Delete
            prep.setInt(1,102);

            //Execute query
            int rowsAffected = prep.executeUpdate();

            if (rowsAffected > 0){
                System.out.println("Record Deleted SuccessFully!!!");
            }else {
                System.out.println("No Record Found with Given ID...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
