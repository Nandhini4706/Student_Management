import java.sql.Connection;
import java.util.*;

import DataBase.DBConnection;
import StudDAO.DAO_Stud;
import Model.Student;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        DAO_Stud dao=new DAO_Stud();
        Student s=new Student("1","Nandhini","20.07.2006","3rd", "IT","99");
        Connection con= DBConnection.getConnection();
       // System.out.println(con);
        while(true){
            System.out.println("----------------------------------------------Menu------------------------------------------------");
            System.out.println("1.Add Student");
System.out.println("2.View Students");
System.out.println("3.Exit");
int num=sc.nextInt();
sc.nextLine();
switch(num){
    case 1:
         System.out.println("Enter Id: ");
         String id=sc.nextLine();
         System.out.println("Enter student name: ");
         String sub=sc.nextLine();
         System.out.println("Enter student academic year: ");
         String year=sc.nextLine();
         System.out.print("Enter Dept Name: ");
         String dept=sc.nextLine();
         System.out.println("Enter student mark: ");
         String mark=sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone=sc.nextLine();
         Student s1=new Student(id,sub,year,dept,mark,phone);
         dao.addStudent(s1);
         break;

    case 2:

}
        }

    }
}