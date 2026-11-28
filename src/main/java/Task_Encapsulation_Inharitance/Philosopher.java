package Task_Encapsulation_Inharitance;

public class Philosopher extends Spartans{
    private String name;
    private String words;

    public Philosopher() {
    }

    public Philosopher(int count, String region, String name, String words) {
        super(count, region);
        setName(name);
        setWords(words);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void think(){
        System.out.println("To reflect");
    }

    public void speak(){
        System.out.println("To deliver a speech");
    }

    @Override
    public void printWord(){
        System.out.println("Most people waste years learning a skill only to quit right before it makes sense, walking away with nothing.");
        System.out.println("Who cares if you look stupid or feel drained?");
        System.out.println("Results don't care how you feel—and if you turn back after coming this far, you'll never know if the path was worth it.");
        System.out.println("Author: mafia & gemini");
    }
}
