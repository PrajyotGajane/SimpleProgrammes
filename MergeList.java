import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        List<Integer> listTwo = new ArrayList<Integer>() {{
            add(5);
            add(6);
            add(7);
            add(8);
        }};

        System.out.println("Values in list one ");
        for (int value : listOne)
            System.out.print(" " + value);
        System.out.println("\nValues in list two ");
        for (int value : listOne)
            System.out.print(" " + value);

        //Using java 8 stream api
        List<Integer> mergedList = Stream.concat(listOne.stream(), listTwo.stream())
                .collect(Collectors.toList());
        System.out.println("\nAfter merging list one and two using Stream API : ");
        for (int value : mergedList)
            System.out.print(" " + value);

        System.out.println("\nAfter merging list one and two into list one : ");
        listOne.addAll(listTwo);
        for (int value : listOne)
            System.out.print(" " + value);
    }
}
