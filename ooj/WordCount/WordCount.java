
import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String [] args) throws Exception {
        File file = new File("Tale of Two Cities.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int lineCount = line.split(" ").length;
            words += lineCount;
        }
        System.out.println("The file contains " + words + " words" );
    }

}