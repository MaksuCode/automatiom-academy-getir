package week_3;

import java.util.List;

public class Student extends Person{

    private int year ;
    private List<Course> courses ;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses (List<Course> courses) {
        int countOfCredits = 0 ;
        for (Course course : courses) {
            course.addStudent(1);
            countOfCredits += course.getCredit();
        }
        if (countOfCredits > 20){
            throw new RuntimeException("You can take 20 credits max!") ;
        }
        this.courses = courses;
    }

    public void addCourse (Course course){
        int count = getTotalCredits() ;
        if (count >= 20){
            throw new RuntimeException("You can take 20 credits max!") ;
        }
        this.courses.add(course);
    }

    public int getTotalCredits(){
        int total = 0 ;
        for (Course course : courses){
            total += course.getCredit();
        }
        return total ;
    }

}
