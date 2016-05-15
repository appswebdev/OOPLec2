package college.edu.tomer.ooplec2;

/**
 * Created by master on 15/05/16.
 */
public class Grade {
    //properties:
   private float grade = -1;
   private String studentID;
   private String courseID;

    //constructor: the full constructor - funnel
    Grade(String studentID, String courseID,Float grade){
        setCourseID(courseID);
        setStudentID(studentID);
        setGrade(grade);
    }

    //convenience constructor:
    Grade(String studentID, String courseID){
        //call the main constructor
        this(studentID, courseID, -1f);
    }
    // convenience constructor:
    Grade(){
        this(null, null, null);
    }




    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    void setGrade(float grade){
        if (grade >= 0 && grade <=100) {
            this.grade = grade;
        }else
        throw new RuntimeException("Error grade must be 0 - 100");
    }

}
