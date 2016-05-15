package college.edu.tomer.ooplec2;

import java.util.ArrayList;

/**
 * Created by master on 15/05/16.
 */
public class GradeBook {
    //properties:
    private ArrayList<Grade> grades = new ArrayList<>();

    public void addGrade(Grade g){
        grades.add(g);
    }

    public ArrayList<Grade> getGrades(){
        return grades;
    }

}
