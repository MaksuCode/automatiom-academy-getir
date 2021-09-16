package week_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<Course> courseList = new ArrayList<Course>() ;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        if (courseList.size() > 3){
            throw new RuntimeException("A teacher can just have 3 courses maximum!") ;
        }
        this.courseList = courseList;
    }

    public void addCourse (Course course){
        if (courseList.size() >= 3){
            throw new RuntimeException("A teacher can just have 3 courses maximum!") ;
        }
        this.courseList.add(course);
    }

    public int getCourseCount(){
        return this.courseList.size() ;
    }

}
