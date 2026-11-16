package Inheritance;

public class Sub1 extends Parent{
    private String surname;
    private String nationality;

    public Sub1(){
        super();
        this.surname = "";
        this.nationality = "";
    }

    public Sub1(String name, int age, String surname, String nationality){
        super(name, age);
        setSurname(surname);
        setNationality(nationality);
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getNationality(){
        return nationality;
    }

    @Override
    public void sayInfo(){
        super.sayInfo();
        System.out.printf("And my Surname %s and I'm %s.\n", this.surname, this.nationality);
    }
}
