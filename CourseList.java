import java.util.ArrayList;
import java. util.*;
public class CourseList implements Cloneable {
    private ArrayList<Course> courses;

    public CourseList(){
        this.courses = new ArrayList<>();

    }
    public CourseList(ArrayList<Course>courses){
        this.courses= new ArrayList<>(courses);

    }
    public CourseList(CourseList other) {
        this.courses = new ArrayList<>();
        for(Course c: other.courses){
            this.courses.add((Course) c.clone());
        }
    }
    public boolean addCourse(Course course){
        return this.courses.add(course);
    }
    public boolean removeCourse(Course course) {
        if(courses.contains(course)){
            return true;
        }
        else {
            return false;
        }
    }
    public Course SearchByName(String name) {
        for (Course c : courses){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    public Course SearchByCode(String code){
        for(Course c : courses){
            if(c.getCode().equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }
    public void SortByName(){
        courses.sort(Comparator.comparing(Course:: getName));
    }
    public void SortByCode(){
        courses.sort(Comparator.comparing(Course::getCode));
    }
    @Override
    public String toString(){
        return courses.toString();
    }

}