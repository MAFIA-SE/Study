package Task_Method;

public class Task {
     //Task 1
    public static void printMassive(int[]  array){
       for (int number : array){
           System.out.println(number);
       }
    }

    //Task 2
    public  static void sumMassive(int[] massive, int[] array){
        int sum = 0;
        if (massive.length == array.length){
            for (int i = 0; i < massive.length; i++) {
                sum += massive[i] + array[i];
            }
            System.out.println("Sum of both arrays: " + sum);
        } else {
            System.out.println("The lengths of the two arrays are not the same.");
        }
    }

    //Task 3
    public static void printInfo(int number){
        if (number > 0){
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negative");
        }
    }

    //Task 4
     public static void printWord(int number, String word){
         for (int i = 0; i < number; i++) {
             System.out.println(word);
         }
     }

     public static String[] returnWord(int number, String word){
        String[] words = new String[number];
         for (int i = 0; i < number; i++) {
             words[i] = word;
         }
         return words;
     }

     //Task 5
    public static void inverseWord(String word){
        char[] array = new char[word.length()];
        int num = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            array[num] = word.charAt(i);
            num++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
