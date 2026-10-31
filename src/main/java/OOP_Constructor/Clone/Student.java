package OOP_Constructor.Clone;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Student(){
        this.name = "";
        this.dateOfBirth = null;
        this.phoneNumber = "";
        this.nationality = "";
    }

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public static void printMassive(Student[] students1){
        LocalDate today = LocalDate.now();
        Period diff;
        int age = 0;

        for (Student person : students1){
            diff = Period.between(person.dateOfBirth, today);
            age = diff.getYears();
            System.out.printf("Name: %s\nDate of birth: %s\nActuality age: %d\nPhone number: %s\nNationality: %s\n", person.name,
                    person.dateOfBirth, age, person.phoneNumber, person.nationality);
        }
    }
}
