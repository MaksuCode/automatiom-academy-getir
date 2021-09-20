package week_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<Course> courseList = new ArrayList<Course>() ;

    public List<Course> getCourseList() {
        return courseList;
    }

    // Adding a course list to the teacher
    // WARNING : This method will replace the recent course list if called !!!
    public void setCourseList(List<Course> courseList) {
        if (courseList.size() > 3){
            throw new RuntimeException("A teacher can just have 3 courses maximum!") ;
        }
        this.courseList = courseList;
    }

    // Adding a course to the teacher's course list
    public void addCourse (Course course){
        if (courseList.size() >= 3 || this.getCourseList().size() + 1 > 3){
            throw new RuntimeException("A teacher can just have 3 courses maximum!") ;
        }
        this.courseList.add(course);
    }

    public int getCourseCount(){
        return this.courseList.size() ;
    }

}
