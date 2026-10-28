package String_Methods_Varargs_Foreach;

import java.util.stream.Stream;

public class Methods {
    //Task 1
    public static int sum(int... nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    //Task 2
    public static void sayJobs(String[] jobs){
        for (String sayJob : jobs){
            System.out.println("My job " + sayJob);
        }
    }
    //Task 3
    public static String methodCheck(String word){
        String step1 = word.trim();
        String step2 =  step1.toUpperCase();
        int indexA = step2.indexOf("A");
        if (indexA != -1){
            String result = step2.substring(0, indexA);
            return result;
        }else {
            String massage = "The word don't have A.";
            return massage;
        }
    }
}
