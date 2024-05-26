import java.util.*;

class Student{
    private String id;
    private String name;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class App {
    private Set<String> studentIds;

    public App(){
        studentIds = new HashSet<>();
    }
    public void addStudents(Student student){
        String id = student.getId();
        if(studentIds.contains(id)){
            System.out.println("Student ID: "+id+" already Exists!");
            return;
        }
        studentIds.add(id);
        System.out.println("Student: "+student.getName()+" Added to the Database");
    }
    public static void main(String[] args) {
        App db = new App();

        Student student1 = new Student("23-CY-33", "Aman Shahid");
        Student student3 = new Student("23-CY-33", "Ayan Atif");
        Student student2 = new Student("23-CY-03", "Sabat Bin Jamil");

        db.addStudents(student1);
        db.addStudents(student2);
        db.addStudents(student3);
    }
}
