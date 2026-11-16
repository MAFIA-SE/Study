package Inheritance;

public class Main {
    public static void main(String[] args) {
        Sub1 sub1 = new Sub1("Kudaiberdi", 17, "Askaraliev", "Kyrgyz");
        sub1.sayInfo();
        Sub2 sub2 = new Sub2("Kudaiberdi", 17,  "Java", "Google");
        sub2.sayInfo();
    }
}
