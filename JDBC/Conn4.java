import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//How to see How Many Records are there in Table
public class Conn4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/ConnectionPractice";
        String name = "root";
        String password = "mann5112";
        try{
            Connection conn = DriverManager.getConnection(url,name,password);
            System.out.println("Successfully Connected...");

            String qu = "SELECT * FROM Persons";
            PreparedStatement preparedStatement = conn.prepareStatement(qu);

            //Execute Query
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = rs.getInt("ID");
                String name1 = rs.getString("Name");
                int age = rs.getInt("Age");

                System.out.println(id + "\t" + name1 + "\t" +age);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
