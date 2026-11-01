package OOP_Constructor;
import java.time.LocalDate;

public class Group {
    String name;
    LocalDate startDate;
    Person mentor;

    public Group(){
        this.name = "";
        this.startDate = LocalDate.MIN;
        this.mentor = new Person();
    }

    public Group(String name, LocalDate startDate, Person mentor){
        this.name = name;
        this.startDate = startDate;
        this.mentor = mentor;
    }

    public void  printInfoGroups(){
        System.out.printf("Name: %s\nStart date: %s\nMentor info: %s %s\n\n",
                this.name, this.startDate, this.mentor.firstName, this.mentor.lastName);
    }
}
