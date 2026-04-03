package StudDAO;
import DataBase.DBConnection;
import Model.Student;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

public class DAO_Stud {
       ArrayList<Student> student;
       public void addStudent(Student students){
           student.add(students);
       }
        public void viewStudent()throws Exception {
            String query = "SELECT* FROM student";

            PreparedStatement ps1 = con.PrepareStatement("Select * from sutudent_db");

        }
}