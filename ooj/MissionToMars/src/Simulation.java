import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Simulation {

    /**
     * This method loads all items from a text file and returns an ArrayList of Items.
     * @param "phaseTxtFile" is the file that contain the Items for each phases.
     * @return the List of Items stored in an array.
     */
    ArrayList<Item> loadItems() throws FileNotFoundException{

        File phaseTxtFile = new File("phase-1.txt");
        Scanner scanner = new Scanner(phaseTxtFile);
        ArrayList<Item> loadPhase1 = new ArrayList<Item>();

        while(scanner.hasNextLine()) {
            String[] stringArray = scanner.nextLine().split("=");
            String name = stringArray[0].trim();
            int weight = Integer.parseInt(stringArray[1].trim());
            loadPhase1.add(new Item(name, weight));

        }
        return loadPhase1;
    }




}
