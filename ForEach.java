import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(){{
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
            add(60);
            add(70);
        }};
        arrayList.forEach(Integer ->{System.out.print(" "+Integer.toString());});
        System.out.println("\nDisplay all the numbers in the arraylist \nthat are less than equal 40 using forEach");
        arrayList.forEach(Integer ->{if (Integer <= 40) System.out.println(""+Integer.toString());});
    }
}
