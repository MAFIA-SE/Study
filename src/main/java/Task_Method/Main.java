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
        System.out.print("Enter word: ");
        String array = scanner.nextLine();
        Task.inverseWord(array);
    }
}
