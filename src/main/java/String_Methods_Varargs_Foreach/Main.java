package String_Methods_Varargs_Foreach;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Task 1
        /*System.out.println(Methods.sum(5, 10, 15, 20, 25, 30, 35, 40, 45, 50));*/
//Task 2
        /*String[] jobs ={"Builder", "Taxi drive", "HR", "Team lead", "CEO"};
        Methods.sayJobs(jobs);*/
//Task 3
        System.out.print("Please, enter any words: ");
        String word = scanner.nextLine();
        System.out.println(Methods.methodCheck(word));

    }
}
