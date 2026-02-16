package View;
import Model.Student;
public class StudDataView {
    private String DataId;
    private Student students;

    public StudDataView(String dataId,String students) {
        DataId = dataId;
        students=students;
    }

    public String getDataId() {
        return DataId;
    }

    public Student getStudents() {
        return students;
    }
}
