package View;
import Model.Teacher;
public class TeacherDataView {
       private String DataTechId;
       private TeacherDataView TeacherData;

    public TeacherDataView(String DataTechId,String TeacherDate) {
        DataTechId = DataTechId;
        TeacherDate=TeacherDate;
    }

    public String getDataTechId() {
        return DataTechId;
    }

    public TeacherDataView getTeacherData() {
        return TeacherData;
    }
}
