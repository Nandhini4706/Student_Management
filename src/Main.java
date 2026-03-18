import java.sql.Connection;
import java.util.*;

import DataBase.DBConnection;
import StudDAO.DAO_Stud;
import Model.Student;
public class Main{
    public static void main(String[]args){
        DAO_Stud dao=new DAO_Stud();
        Student s=new Student("1","Nandhini","20.07.2006","3rd", "IT","99");
        Connection con= DBConnection.getConnection();

        while(true){
            System.out.println("----------------------------------------------Menu------------------------------------------------");
            System.out.println("1.Add Student");

        }
    }
}