package Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    List<String> subjects;
    public MBAStudentBuilder(){
        subjects=new ArrayList<>();
    }

    @Override
    public StudentBuilder setSubjects(){
        subjects.add("economics");
        subjects.add("commerce");
        subjects.add("arts");
        super.subjects=subjects;
        return this;
    }

}
