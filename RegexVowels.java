import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexVowels {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the string for vowels check : ");
        String userInput = readInput.nextLine();
        boolean stringContainsVowels = checkVowels(userInput);
        if(stringContainsVowels){
            System.out.println("\nString contains vowels");
        } else
        {
            System.out.println("\nString doesn't contain vowels");
        }
    }


    public static boolean checkVowels(String input) {
        String vowels = "[aeiouAEIOU]";
        Pattern.compile(vowels);
        Pattern pattern = Pattern.compile(vowels);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
