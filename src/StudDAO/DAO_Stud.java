package StudDAO;
import DataBase.DBConnection;
import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO_Stud {
       ArrayList<Student> student;
       public void addStudent(Student students){
           student.add(students);
       }
        public void viewStudent(){

        }
}