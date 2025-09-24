public class Course implements Cloneable {
    private String name;
    private String courseName;
    public Course() {
        this.name="empty";
        this.courseName="empty";
    }
    public Course(String name, String courseName) {
        this.name= name;
        this.courseName= courseName;

    }
    public Course(Course other) {
        this.name = other.name;
        this.courseName= other.courseName;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setCourseName( String courseName) {
        this. courseName= courseName;
    }
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
    public String toString(){
        return "Name: " + name + ", CourseName: " +courseName;  }
        
}
