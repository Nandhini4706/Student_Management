package Model;

public class Teacher {
    private String TeacherId;
    private String TeacherName;
    private String TeacherDept;
    private String Subject;
    private String YearJoin;

    public Teacher(String TeacherId,String TeacherName, String TeacherDept, String Subject, String YearJoin) {
        TeacherId = TeacherId;
        TeacherName = TeacherName;
        TeacherDept = TeacherDept;
        Subject=Subject;
        YearJoin=YearJoin;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public String getTeacherDept() {
        return TeacherDept;
    }

    public String getYearJoin() {
        return YearJoin;
    }

    public String getSubject() {
        return Subject;
    }

}
