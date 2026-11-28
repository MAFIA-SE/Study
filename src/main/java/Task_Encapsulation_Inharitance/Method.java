package Task_Encapsulation_Inharitance;

public class Method {
    public static void sortByCount(Spartans[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].getCount() >= array[j + 1].getCount()){
                    Spartans temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getCount());
        }
    }
}
