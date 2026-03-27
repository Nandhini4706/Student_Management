package Model;

public class Student {
    private String StudId;
    private String StudName;
    private String StudYear;
    private String StudDept;
    private String StudMark;
    private String StudPhone;

    public Student(String StudId, String StudName, String StudYear, String StudDept, String StudMark, String StudPhone) {
        StudId = StudId;
        StudName = StudName;
          StudYear = StudYear;
        StudDept = StudDept;
           StudMark = StudMark;
        StudPhone = StudPhone;
    }

    public String getStudId() {
        return StudId;
    }

    public String getStudName() {
        return StudName;
    }

    public String getStudYear() {
        return StudYear;
    }
    public String getStudPhone() {
        return StudPhone;
    }

    public String getStudDept() {
        return StudDept;
    }

    public String getStudMark() {
        return StudMark;
    }
}
