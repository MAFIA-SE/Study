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
        for (char c : array) {
            System.out.print(c);
        }
    }

    public static String word(String word){
        char[] array = new char[word.length()];
        int num = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            array[num] = word.charAt(i);
            num++;
        }
        StringBuilder inverseWord = new StringBuilder();
        for (char c : array) {
            inverseWord.append(c);
        }
        return inverseWord.toString();
    }

    //Task 6
    public static int[] arrayPlus1(int[] array){
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i] + 1;
        }
        return numbers;
    }

    //Task 7.1

    public static int bigNumber(int number1, int number2, int number3){
        int max = number1;

        if (number1 == number2 && number1 == number3){
            return 0;
        }else {
            if (number2 > max){
                max = number2;
            }
            if (number3 > max){
                max = number3;
            }
            return max;
        }
    }

    //Task 7.2
    public static int bigNumber(int[] array){
        int max = array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    //Task 7.3
    public static int smallNumber(int[] array){
        int min = array[0];

        for (int i : array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    //Task 8
    public static boolean presentOrNot(String[] words, String word){
        for (String i : words){
            if (i.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }

    //Task 9
    public static int findMonth(int month){
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
    }
}
