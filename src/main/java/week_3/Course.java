package week_3;

public class Course {

    private String name ;
    private int credit ;
    private int studentCount ;
    private final int limit = 20 ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void addStudent (int count){
        if (studentCount >= limit){
            throw new RuntimeException("The course if full!") ;
        }
        this.studentCount += count ;
    }

}
