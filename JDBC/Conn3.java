import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conn3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/ConnectionPractice";
        String name = "root";
        String password = "mann5112";

        try{
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Connection Done.");

            //Updating Record
            String Query = "UPDATE Persons SET Name = ? where ID = ?";
            PreparedStatement PrepStmt = con.prepareStatement(Query);

            //Here Where ID Will be 102 there Name will be Updated to Meet
           PrepStmt.setString(1,"Meet");
           PrepStmt.setInt(2,102);

           PrepStmt.executeUpdate();
            System.out.println("Updated Record SuccessFully!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
