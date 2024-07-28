package Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    List<String> subjects;
    public EngineeringStudentBuilder(){
       subjects=new ArrayList<>();
    }

    @Override
    public StudentBuilder setSubjects(){
        subjects.add("dsa");
        subjects.add("os");
        subjects.add("dbms");
        super.subjects=subjects;
        return this;
    }

}
