import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the number of values you want add : ");
        Scanner readInput = new Scanner(System.in);
        int limit = readInput.nextInt();
        System.out.println("Enter the int values in jumbled manners :");
        for (int index = 0; index < limit; index++) {
            int userInput = readInput.nextInt();
            map.put(index, userInput);
        }
        System.out.println("Key    Value");
        map.forEach((key, value) -> {
            System.out.println(" " + key + " ----- " + value);
        });

        System.out.println("After sorting ");
        System.out.println("Key    Value");
        map.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(" " + k.getKey() + " ----- " + k.getValue()));

    }
}

