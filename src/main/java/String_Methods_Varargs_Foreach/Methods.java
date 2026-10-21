package String_Methods_Varargs_Foreach;

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
}
