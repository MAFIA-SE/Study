package Task_Encapsulation_Inharitance;

public class Main {
    public static void main(String[] args) {
        //Task 1
        /*Phone samsung = new Phone("25", "Samsung", "S", "5G");
        Phone apple = new Phone("Pro Max", "Apple", "16", "5G");
        Computer asus = new Computer("Vivobook", "Asus", "S", "Integrated graphics card");
        Computer msi = new Computer("Prestige", "MSI", "Studio", "RTX 4070");
        SmartWatch garmin = new SmartWatch("Forerunner", "Garmin", "570", "AMOLED-display");
        SmartWatch huawei = new SmartWatch("Fit", "Huawei", "4", "AMOLED-display");

        Technique[] devices = {samsung, apple, asus, msi, garmin, huawei};

        for (Technique device : devices) {
            System.out.println("Name: " + device.getName() +
                    ", Brand: " + device.getBrand() +
                    ", Version: " + device.getVersion());
            System.out.println(device.turnOn());
            System.out.println(device.turnOff());
            System.out.println("------------------------");
        }*/

        //Task 2
        Mother mother = new Mother("Alex", 42, "Blue");
        Mother mother2 = new Mother("Janna", 34, "Green");
        Daughter daughter = new Daughter("Anna", 13, "Blue", "Black", 145);
        Daughter daughter2 = new Daughter("Seiko", 10, "Brown", "Blond", 125);

        System.out.println(mother.statusPerson());
        System.out.println(mother2.statusPerson());
        System.out.println(daughter.statusPerson());
        System.out.println(daughter2.statusPerson());
    }
}
