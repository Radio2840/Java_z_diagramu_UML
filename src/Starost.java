import java.time.LocalDate;

public class Starost {
    private String groupName;

    public String Starost(String name, String surname) {
        return name+surname;
    }
    public String postponeColloquium(LocalDate date){
        if (date == LocalDate.now()) {
            return "tak";
        }
        else {
            return "nie";
        }

    }
}
