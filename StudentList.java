import java.util.*;
public class StudentList implements Cloneable{
    private ArrayList<Student> students;

    public StudentList(){
        this.students = new ArrayList<>();

    }
    public StudentList(ArrayList<Student>students){
        this.students=new ArrayList<>(students);

    }
    public StudentList(StudentList other){
        this. students = new ArrayList<>();
        for(Student s : students) {
            this.students.add((Student) s.clone());
        }

    }
    public boolean addStudent(Student student){
        return this.students.add(student);
    }
    public boolean removeStudent(String seatno){
        for(Student s : students){
        if(s.getSeatNo().equals(seatno)){
            students.remove(s);
            return true;

        }
    }
    return false;

    }

        public Student SearchByName(String name) {
            for(Student s : students) {
                if(s.getName().equalsIgnoreCase(name)){
                    return s;
                }
            }
            return null;
        }
        
    
    public Student SearchBySeatNo(String seatno){
        for(Student s : students){
            if(s.getSeatNo().equals(seatno)){
                return s;
            }
        }
        return null;
    }
    public void SortByName(){
        students.sort(Comparator.comparing(Student::getName));

    }
    public void SortBySeatNo(){
        students.sort(Comparator.comparing(Student::getSeatNo));
    }
    public String toString(){
        return students.toString();
    }

}
