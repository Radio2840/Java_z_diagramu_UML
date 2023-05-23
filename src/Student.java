import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Student extends Starost{
    private String name;
    private String surname;
    private LocalDate birthdate;
    private int sciencePoints=0;
    private int lifePoints=0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void learn(LocalDate from, LocalDate to){
        long dni = 0;
        if(from.isBefore(to)){
            dni = to.until(from, ChronoUnit.DAYS);
        } else if (from.isBefore(to)) {
            dni = from.until(to, ChronoUnit.DAYS);
        }
        else {
            dni =1;
        }
        sciencePoints += dni;


    }
    public void party(LocalDate from, LocalDate to){
        long dni = 0;
        if(from.isBefore(to)){
            dni = to.until(from, ChronoUnit.DAYS);
        } else if (from.isBefore(to)) {
            dni = from.until(to, ChronoUnit.DAYS);
        }
        else {
            dni =1;
        }
        lifePoints += dni;
    }
    public boolean isGoodStudent(){
        if(sciencePoints > 10){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
