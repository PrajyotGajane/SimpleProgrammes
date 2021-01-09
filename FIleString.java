import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleString {
    public static void main(String[] args) {
        File file = new File("src\\StringFile.txt");
        String find = "Blue";
        try {
            Scanner readFile = new Scanner(file);
            int lineNumber = 0;
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                lineNumber++;
                if(line.equals(find)){
                    System.out.println("String found at line : " + lineNumber);
                    break;
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.printf(" File not found ");
        }
    }
}
