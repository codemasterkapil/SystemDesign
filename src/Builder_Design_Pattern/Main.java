package Builder_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        StudentBuilder engineeringStudent=new EngineeringStudentBuilder();
        StudentBuilder mbaStudent=new MBAStudentBuilder();

        System.out.println(engineeringStudent.setSubjects().setAge(22).setName("Takshil").setRollNumber(1904).build().toString());
        System.out.println(mbaStudent.setSubjects().setAge(23).setName("Kapil").setRollNumber(1918).setRollNumber(1904).build().toString());

    }
}
