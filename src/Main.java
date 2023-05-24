import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University graham = new University();
        Scanner odp = new Scanner(System.in);
        int odpowiedz;
        String name;
        String surname;
        int dzien;
        int miesiac;
        int rok;
        int dzien2;
        int miesiac2;
        int rok2;
        System.out.println("Witamy W wirtualnym menu co chcesz zrobić?");
        while(true){
            System.out.println("1 - Dodaj studenta" +
                    "\n2 - Usun Studenta" +
                    "\n3 - Znajdz Studenta" +
                    "\n4 - Dodaj daty kiedy Student sie uczyl" +
                    "\n5 - Dodaj daty kiedy Student imprezowal" +
                    "\n6 - Zakoncz program ");
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
                    System.out.println(graham.getStudent(name,surname).toString() + "\n" + "Czy jest dobry: " + graham.getStudent(name,surname).isGoodStudent());
                    break;
                case 4:
                    System.out.println("Podaj imie: ");
                    name = odp.next();
                    System.out.println("Podaj nazwisko: ");
                    surname = odp.next();

                    System.out.println("Podaj dzien startu nauki");
                    dzien = odp.nextInt();
                    System.out.println("Podaj miesiac startu nauki");
                    miesiac = odp.nextInt();
                    System.out.println("Podaj rok startu nauki");
                    rok = odp.nextInt();

                    System.out.println("Podaj dzien zakonczenia nauki");
                    dzien2 = odp.nextInt();
                    System.out.println("Podaj miesiac zakonczenia nauki");
                    miesiac2 = odp.nextInt();
                    System.out.println("Podaj rok zakonczenia nauki");
                    rok2 = odp.nextInt();

                    try {
                        graham.getStudent(name,surname).learn(LocalDate.of(rok,miesiac,dzien),LocalDate.of(rok2,miesiac2,dzien2));
                    }
                    catch (DateTimeException e ){
                        System.out.println("zle dane daty");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("Podaj imie: ");
                    name = odp.next();
                    System.out.println("Podaj nazwisko: ");
                    surname = odp.next();

                    System.out.println("Podaj dzien startu imprezy");
                    dzien = odp.nextInt();
                    System.out.println("Podaj miesiac startu imprezy");
                    miesiac = odp.nextInt();
                    System.out.println("Podaj rok startu imprezy");
                    rok = odp.nextInt();

                    System.out.println("Podaj dzien zakonczenia imprezy");
                    dzien2 = odp.nextInt();
                    System.out.println("Podaj miesiac zakonczenia imprezy");
                    miesiac2 = odp.nextInt();
                    System.out.println("Podaj rok zakonczenia imprezy");
                    rok2 = odp.nextInt();

                    try {
                        graham.getStudent(name,surname).party(LocalDate.of(rok,miesiac,dzien),LocalDate.of(rok2,miesiac2,dzien2));
                    }
                    catch (DateTimeException e ){
                        System.out.println("zle dane daty");
                        continue;
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pa Pa");
            }
            if (odpowiedz == 6) {
                break;
            }
        }
    }
}