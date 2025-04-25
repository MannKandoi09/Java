//Simple JDBC Connection Testing

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
        String name = "root";
        String password  = "mann5112";
        try{
            //Loading Driver to Get Connection with MySQL
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Connection done SuccessFully!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
