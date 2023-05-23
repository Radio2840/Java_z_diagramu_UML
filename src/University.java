import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private List<Student> listaStudentow = new ArrayList<>();

    public void addStudent(String name, String surname){
        listaStudentow.add(new Student(name, surname));
    }
    public Student getStudent(String name, String surname){
        for (Student student: listaStudentow){
            if(Objects.equals(student.getName(), name) && Objects.equals(student.getSurname(), surname)){
                return student;
            }
        }
        return null;
    }
    public boolean removeStudent(String name, String surname){
        for (Student student: listaStudentow){
            if(Objects.equals(student.getName(), name) && Objects.equals(student.getSurname(), surname)){
                listaStudentow.remove(student);
                return true;
            }
        }
        return false;
    }
}
