public class ImmutableString {
    public static void referenceCheck(Object refOne, Object refTwo) {
        if (refOne == refTwo) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }
    }
    public static void main(String[] args) {
        String stringOne = "Immutable";
        String stringTwo = "Immutable";
        System.out.println("Before modification in string 1");
        referenceCheck(stringOne, stringTwo);
        stringOne += "String";
        System.out.println("After Modification");
        referenceCheck(stringOne, stringTwo);
    }
}