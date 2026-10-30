package OOP_Constructor.Clone;
import java.time.LocalDate;

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

}
