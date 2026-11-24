package Task_Method;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        /*int[] array = {5,12, 4,5, 2};
        Task.printMassive(array);*/

        //Task 2
        /*System.out.print("Enter length array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter value in index array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter length array 2: ");
        length = scanner.nextInt();
        int[] array2 = new int[length];
        System.out.println("Enter value in index array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Index: " + i);
            array2[i] = scanner.nextInt();
        }
        Task.sumMassive(array, array2);*/

        //Task 3
        /*System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        Task.printInfo(number);*/

        //Task 4
       /* System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter any words: ");
        String word = scanner.nextLine();

        Task.printWord(number, word);

        for (String s : Task.returnWord(number, word)) {
            System.out.println(s);
        }*/

        //Task 5
       /* System.out.print("Enter word: ");
        String array = scanner.nextLine();
        Task.inverseWord(array);
        System.out.println(Task.word(array));*/

        //Task 6
       /* System.out.print("Enter the length array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number in index " + i );
            array[i] = scanner.nextInt();
        }
        int[] updateArray = Task.arrayPlus1(array);
        for (int j : updateArray) {
            System.out.println(j);
        }*/

        //Task 7.1
        /*System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number3 = scanner.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println("All equals");
        } else {
            System.out.println(Task.bigNumber(number1, number2, number3));
        }*/

        //Task 7.2
        /*System.out.print("Enter the length array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number in index " + i );
            array[i] = scanner.nextInt();
        }
        System.out.print("Big number in array: " + Task.bigNumber(array));*/

        //Task 7.3
        /*System.out.print("Enter the length array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number in index " + i );
            array[i] = scanner.nextInt();
        }
        System.out.print("Small number in array: " + Task.smallNumber(array));*/

        //Task 8
        /*System.out.print("Enter the length array: ");
        int length = scanner.nextInt();
        String[] words = new String[length];

        scanner.nextLine();
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word in index " + i );
            words[i] = scanner.nextLine();
        }
        System.out.println("Enter any words: ");
        String word = scanner.nextLine();
        boolean trueOrFalse = Task.presentOrNot(words, word);
        if (trueOrFalse){
            System.out.println("There is a word");
        }else {
            System.out.println("There is no such word");
        }*/

        //Task 9
        System.out.print("Enter number Month without 0: ");
        int month = scanner.nextInt();
        int countDays = Task.findMonth(month);
        if ( countDays != 0) {
            System.out.printf("Days: %d", countDays);
        } else {
            System.out.println("Error");
        }
    }
}
