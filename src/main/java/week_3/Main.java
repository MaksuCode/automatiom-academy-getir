package week_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Initializing some courses here.
        Course mathCourse = new Course() ;
        mathCourse.setName("Math Course");
        mathCourse.setCredit(4);

        Course englishCourse = new Course() ;
        englishCourse.setName("English Course");
        englishCourse.setCredit(3);

        Course physicsCourse = new Course() ;
        physicsCourse.setName("Physics Course");
        physicsCourse.setCredit(4);

        // Creating a new student.
        List<Course> courseListOfMustafa = new ArrayList<Course>();
        courseListOfMustafa.add(mathCourse) ;
        courseListOfMustafa.add(englishCourse) ;
        courseListOfMustafa.add(physicsCourse) ;

        Student student = new Student();
        student.setName("Mustafa");
        student.setSurname("Aksu");
        student.setCourses(courseListOfMustafa);

        System.out.println("Course count taken : " + student.getCourses().size());
        System.out.println("Total credits : " + student.getTotalCredits());

        // Creating a second student.

        List<Course> courseListOfIpek = new ArrayList<Course>();
        courseListOfIpek.add(mathCourse) ;
        courseListOfIpek.add(englishCourse) ;
        courseListOfIpek.add(physicsCourse) ;

        Student student2 = new Student();
        student2.setName("İpek");
        student2.setSurname("Tuncer");
        student2.setCourses(courseListOfIpek);

        System.out.println("Course count taken : " + student2.getCourses().size());
        System.out.println("Total credits : " + student2.getTotalCredits());

        System.out.println("Math course has " + mathCourse.getStudentCount() + " students.");
        System.out.println("English course has " + englishCourse.getStudentCount() + " students.");
        System.out.println("Physics course has " + physicsCourse.getStudentCount() + " students.");

        Teacher mathTeacher = new Teacher();
        mathTeacher.setName("Mehmet") ;
        mathTeacher.setSurname("Gül");
        mathTeacher.setAge(41);
        mathTeacher.setGender("male");
        mathTeacher.setCourseList(courseListOfMustafa);


        System.out.println(mathTeacher.getCourseCount());


    }
}
