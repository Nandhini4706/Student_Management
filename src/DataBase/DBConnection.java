package DataBase;
import DataBase.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.Callable;

public class DBConnection {
public static Connection getConnection() {
          Connection con=null;
          try{
              String url="jdbc:mysql://localhost:3306/student_db";
                String username="root";
                String password="Nandhu07";
                con = DriverManager.getConnection(url,username,password);
                System.out.println("Database");
          }catch(Exception e){
              e.printStackTrace();
          }
    return con;
    }
}
