import java.util.ArrayList;
import java.util.List;

class Student {
    String jmeno;
    String prijmeni;
    int vek;
    String nazevTridy;

    public Student(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }

    public void nastavTridu(String nazevTridy) {
        this.nazevTridy = nazevTridy;
    }

    public void vypisInformace() {
        System.out.println(jmeno + " " + prijmeni + " - " + nazevTridy);
    }
}

class Trida {
    String nazev;
    List<Student> studenti;

    public Trida(String nazev) {
        this.nazev = nazev;
        this.studenti = new ArrayList<>();
    }

    public void pridejStudenta(Student student) {
        studenti.add(student);
    }
}

    public class TretakNaStredni {

    public static void main(String[] args) {
        Trida tridaA = new Trida("A");
        Trida tridaB = new Trida("B");

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Anna", "Nováková", 16));
        studenti.add(new Student("Petr", "Svoboda", 20));
        studenti.add(new Student("Eva", "Marešová", 15));
        studenti.add(new Student("Martin", "Procházka", 18));
        studenti.add(new Student("Lucie", "Černá", 17));
        studenti.add(new Student("Tomáš", "Veselý", 22));
        studenti.add(new Student("Karolína", "Kovářová", 14));
        studenti.add(new Student("Ondřej", "Dvořák", 19));
        studenti.add(new Student("Veronika", "Bartošová", 16));
        studenti.add(new Student("Jakub", "Havránek", 21));

        for (Student student : studenti) {
            if (student.vek < 18) {
                tridaA.pridejStudenta(student);
                student.nastavTridu(tridaA.nazev);
            } else {
                tridaB.pridejStudenta(student);
                student.nastavTridu(tridaB.nazev);
            }
        }

        System.out.println("Informace o studentech:");
        for (Student student : studenti) {
            student.vypisInformace();
        }
    }
}
