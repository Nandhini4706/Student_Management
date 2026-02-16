package Model;

public class Teacher {
    private String TeacherId;
    private String TeacherName;
    private String TeacherDept;
    private String Subject;

    public Teacher(String TeacherId,String TeacherName, String TeacherDept, String Subject) {
        TeacherId = TeacherId;
        TeacherName = TeacherName;
        TeacherDept = TeacherDept;
        Subject=Subject;
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

    public String getSubject() {
        return Subject;
    }
}
