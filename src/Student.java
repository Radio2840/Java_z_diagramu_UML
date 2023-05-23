import java.time.LocalDate;
import java.util.Objects;

public class Student extends Starost{
    private String name;
    private String surname;
    private LocalDate birthdate;
    private int sciencePoints;
    private int lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void learn(LocalDate from, LocalDate to){

    }
    public void party(LocalDate from, LocalDate to){

    }
    public boolean isGoodStudent(){
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
