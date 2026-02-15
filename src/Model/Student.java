package Model;

public class Student {
    private String StudId;
    private String StudName;
    private String StudBirth;
    private String StudYear;
    private String StudDept;
    private String StudMark;

    public Student(String StudId, String StudName, String StudBirth, String StudYear, String StudDept, String StudMark) {
        StudId = StudId;
        StudName = StudName;
         StudBirth = StudBirth;
          StudYear = StudYear;
           StudMark = StudMark;
            StudDept = StudDept;
    }

    public String getStudId() {
        return StudId;
    }

    public String getStudName() {
        return StudName;
    }

    public String getStudBirth() {
        return StudBirth;
    }

    public String getStudYear() {
        return StudYear;
    }

    public String getStudDept() {
        return StudDept;
    }

    public String getStudMark() {
        return StudMark;
    }
}
