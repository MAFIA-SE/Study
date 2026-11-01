package OOP_Constructor;

public class Seasons {
    public static void checkSeason(int numSeason){
        if(numSeason == 3 || numSeason == 4|| numSeason == 5){
            System.out.println("It's spring.");
        } else if (numSeason == 6 || numSeason == 7 || numSeason == 8) {
            System.out.println("It's summer.");
        } else if (numSeason == 9 || numSeason == 10 || numSeason == 11) {
            System.out.println("It's autumn.");
        } else if (numSeason == 12 || numSeason == 1 || numSeason == 2){
            System.out.println("It's winter.");
        } else {
            System.out.println("There is no such date in the month.");
        }
    }
}
