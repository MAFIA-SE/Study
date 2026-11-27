package Task_Encapsulation_Inharitance;

public class Technique {
    private String name;
    private String brand;
    private String version;

    public Technique(){
    }

    public Technique(String name, String brand, String version){
        setName(name);
        setBrand(brand);
        setVersion(version);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String turnOn(){
        return name + " turn on";
    }

    public String turnOff(){
        return name + " turn off";
    }
}
