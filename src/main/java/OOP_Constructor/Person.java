package OOP_Constructor;
import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public Person(){
        this.firstName ="";
        this.lastName = "";
        this.dateOfBirth = LocalDate.MIN;
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void printInfoPerson(){
        System.out.printf("Name: %s\nSurname: %s\nYear of birth: %s\n\n",
                this.firstName, this.lastName, this.dateOfBirth);
    }
}
