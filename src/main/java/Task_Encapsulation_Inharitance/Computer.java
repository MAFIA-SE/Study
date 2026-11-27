package Task_Encapsulation_Inharitance;

public class Computer extends  Technique{
    private String gpuModel;

    public Computer(String name, String brand, String version, String gpuModel) {
        super(name, brand, version);
        this.gpuModel = gpuModel;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    @Override
    public String turnOn() {
        return gpuModel + " The image is displayed";
    }

    @Override
    public String turnOff() {
        return gpuModel + " the image is not displayed";
    }


}
