import java.util.Scanner;

public class WhiteSpaces {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the string of white spaces : ");
        String userInput = readInput.nextLine();
        char[] userInputArray = userInput.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char eachChar : userInputArray) {
            if ((eachChar != ' ') && (eachChar != '\t')) {
                stringBuilder.append(eachChar);
            }
        }

        String noWhiteSpace = stringBuilder.toString();
        System.out.println(noWhiteSpace);
    }
}
