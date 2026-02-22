import java.util.*;
import StudDAO.DAO_Stud;
import Model.Student;
public class Main{
    public static void main(String[]args){
        DAO_Stud dao=new DAO_Stud();
        Student s=new Student("1","Nandhini","20.07.2006","3rd", "IT","99");
        dao.addStudent(s);
        dao.viewStudent();
    }
}