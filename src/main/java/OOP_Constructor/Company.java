package OOP_Constructor;
import java.time.LocalDate;


public class Company {
    String name;
    String country;
    LocalDate yearOfFoundation;
    Person founder;
    Group[] groups;

    public Company(){
        this.name = "";
        this.country = "";
        this.yearOfFoundation = LocalDate.MIN;
        this.founder = new Person();
        this.groups = new Group[0];
    }

    public Company(String name, String country, LocalDate yearOfFoundation, Person founder, Group[] groups){
        this.name = name;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

    public void printInfoCompany(){
        System.out.printf("Name: %s\nCountry: %s\nFoundation: %s\nFounder: %s %s\n\n",
                this.name, this.country, this.yearOfFoundation, this.founder.firstName, this.founder.lastName);

        System.out.println("Company Groups:");

        if (this.groups != null && this.groups.length > 0){
            for (Group group : this.groups){
                group.printInfoGroups();
            }
        }else {
            System.out.println("No groups available.");
        }
    }
}
