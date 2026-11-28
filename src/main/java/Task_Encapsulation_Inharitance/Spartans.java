package Task_Encapsulation_Inharitance;

public class Spartans {
    private int count;
    private String region;

    public Spartans(){
    }

    public Spartans(int count, String region){
        setCount(count);
        setRegion(region);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void printWord(){
        System.out.println("For Sparta");
    }

}
