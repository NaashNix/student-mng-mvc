package modal;

public class Student {
    private String studentId;
    private String name;
    private int prf;
    private int dbms;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrf() {
        return prf;
    }

    public void setPrf(int prf) {
        this.prf = prf;
    }

    public int getDbms() {
        return dbms;
    }

    public void setDbms(int dbms) {
        this.dbms = dbms;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", prf=" + prf +
                ", dbms=" + dbms +
                '}';
    }

    public Student(String studentId, String name, int prf, int dbms) {
        this.studentId = studentId;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    }
}
