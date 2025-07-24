package Model;

public class Teacher_Model {
    int teaID;
    String address;
    String studyField;

    public void displayInfo() {
        System.out.println ("Teacher ID: " + teaID);
        System.out.println ("Address: " + address);
        System.out.println ("Field of Study: " + studyField);
    }

    public int getTeaID() {
        return teaID;
    }

    public String getAddress() {
        return address;
    }

    public String getStudyField() {
        return studyField;
    }
}
