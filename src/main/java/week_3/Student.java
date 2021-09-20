package week_3;

import java.util.List;

public class Student extends Person{

    private int year ;            // Year of the student
    private List<Course> courses ; // Course list of the student

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Adding a course list to the student
    // WARNING : This method will replace the recent course list if called !!!
    public void setCourses (List<Course> courses) {
        int countOfCredits = 0 ;
        for (Course course : courses) {
            course.addStudent(this);
            countOfCredits += course.getCredit();
        }
        if (countOfCredits > 20){
            throw new RuntimeException("You can take 20 credits max!") ;
        }
        this.courses = courses;
    }

    // Adding a course to the student
    public void addCourse (Course course){
        int count = getTotalCredits() ;
        if (count >= 20 || this.getTotalCredits() + course.getCredit() > 20){
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
