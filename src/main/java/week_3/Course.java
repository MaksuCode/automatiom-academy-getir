package week_3;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name = "DEFAULT_NAME" ;    //Default name for the course
    private int credit = 3 ;                  //Default credit for the course
    private int studentCount = 0 ;            //Initializing student count as "0"
    private final int limit = 20 ;            //Default max student limit

    private List<Student> studentList = new ArrayList<>();  //Initializing an empty list for student list
    private Teacher teacher ;                 //Teacher of the course

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit (int credit) {
        this.credit = credit;
    }

    public int getStudentCount() {
        return this.studentList.size();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    // Setting a student list to the course.
    // WARNING : If this method is called the recent student list will be replaced !!!
    public void setStudentList (List<Student> studentList) {
        if (this.studentCount >= limit){
            throw new  RuntimeException("The course is full!") ;
        }
        if (this.studentCount + studentList.size() > 20){
            throw new RuntimeException("The student list is too large too be enrolled together!") ;
        }
        this.studentList = studentList;
    }

    public Teacher getTeacher () {
        return teacher;
    }

    // Setting the teacher of the course
    public void setTeacher (Teacher teacher) {
        if (this.teacher != null){
            throw new RuntimeException("This course has already a teacher!") ;
        }
        this.teacher = teacher;
    }

    // Adding a student to course
    public void addStudent (Student student){
        if (this.studentCount >= limit){
            throw new  RuntimeException("The course is full!") ;
        }
        if (this.studentList.contains(student)){
            throw new RuntimeException("This student has already enrolled for this course!") ;
        }
        this.studentList.add(student) ;
    }

}
