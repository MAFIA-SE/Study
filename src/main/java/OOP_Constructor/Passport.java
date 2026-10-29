package OOP_Constructor;

public class Passport {
    int id;
    String firstName;
    String lastName;
    int yearOfBirth;
    char gender;
    String countryOfBirth;

    public Passport(){
        this.id = 0;
        this.firstName = "Null";
        this.lastName = "Null";
        this.yearOfBirth = 0;
        this.gender = 'U';
        this.countryOfBirth = "Null";
    }

    public Passport(int id, String firstName, String lastName, int yearOfBirth, char gender, String  countryOfBirth){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.countryOfBirth = countryOfBirth;
    }

    public void printInfo(){
        System.out.printf("ID: %d\nName: %s\nSurname: %s\nYear of birth: %d\nGender: %c\nCountry: %s",
                this.id, this.firstName, this.lastName, this.yearOfBirth, this.gender, this.countryOfBirth);
    }
}
