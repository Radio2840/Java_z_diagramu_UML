import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University graham = new University();
        Scanner odp = new Scanner(System.in);
        int odpowiedz;
        String name;
        String surname;
        System.out.println("Witamy W wirtualnym menu co chcesz zrobić?");
        while(true){
            System.out.println("1 - Dodaj studenta" +
                    "\n2 - Usun Studenta" +
                    "\n3 - Znajdz Studenta" +
                    "\n4 - Dodaj daty kiedy Student sie uczyl" +
                    "\n5 - Dodaj daty kiedy Student imprezowal" +
                    "\n6 - ");
            odpowiedz = odp.nextInt();
            switch(odpowiedz) {
                case 1:
                    System.out.println("Podaj imie: ");
                    name = odp.next();
                    System.out.println("Podaj nazwisko: ");
                    surname = odp.next();
                    graham.addStudent(name,surname);
                    break;
                case 2:
                    System.out.println("Podaj imie: ");
                    name = odp.next();
                    System.out.println("Podaj nazwisko");
                    surname = odp.next();
                    graham.removeStudent(name,surname);
                    break;
                case 3:
                    System.out.println("Podaj imie: ");
                    name = odp.next();
                    System.out.println("Podaj nazwisko: ");
                    surname = odp.next();
                    System.out.println(graham.getStudent(name,surname).toString());
                    break;
                case 4:
                    // code block
                    break;
                case 5:
                    // code block
                    break;
                case 6:
                    // code block
                    break;
                default:
                    System.out.println("Pa Pa");
            }
            break;
        }
    }
}