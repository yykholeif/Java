import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Simulation {

    private int phaseNumber;

    /**
     * This method loads all items from a text file and returns an ArrayList of Items.
     * @param "phaseTxtFile" is the file that contain the Items for each phase ("phase-1.txt"/"phase-2.txt")
     * @return the List of Items stored in an array.
     */
    ArrayList<Item> loadItems(int phase) throws FileNotFoundException{

        String fileName = "";
        phaseNumber = phase;


            if (phaseNumber == 1){
                System.out.println("Load Phase 1 items");
                fileName = "phase-1.txt";
            } else if (phaseNumber == 2) {
                System.out.println("Load Phase 2 items");
                fileName = "phase-2.txt";
            }


        File phaseTxtFile = new File(fileName);
        Scanner scanner = new Scanner(phaseTxtFile);
        ArrayList<Item> loadPhaseItems = new ArrayList<Item>();

        while(scanner.hasNextLine()) {
            String[] stringArray = scanner.nextLine().split("=");
            String name = stringArray[0].trim();
            int weight = Integer.parseInt(stringArray[1].trim());
            loadPhaseItems.add(new Item(name, weight));

        }
        return loadPhaseItems;
    }

    //load U1 rockets with Cargo
    ArrayList<U1> loadU1(ArrayList<Item> phaseCargo) throws FileNotFoundException {
        ArrayList<U1> u1RocketsArray = new ArrayList<U1>();

        while(!phaseCargo.isEmpty()) {

            //create a loop to iterate and fill up rockets one by one
            for (Item item : phaseCargo) {

                //remove hardcoding of rocket attributes && handle conversion of KG to Tonnes
                U1 u1Rocket = new U1();

                if (u1Rocket.canCarry(item)){
                    u1Rocket.carry(item);
                    phaseCargo.remove(item);
                    u1RocketsArray.add(u1Rocket);
                } else {
                    break;
                }
            }
        }
        return u1RocketsArray;
    }

    //load U2 rockets with Cargo
    ArrayList<U2> loadU2(ArrayList<Item> phaseCargo) throws FileNotFoundException {
        ArrayList<U2> u2RocketsArray = new ArrayList<U2>();

        while(!phaseCargo.isEmpty()) {

            //create a loop to iterate and fill up rockets one by one
            for (Item item : phaseCargo) {

                //remove hardcoding of rocket attributes && handle conversion of KG to Tonnes
                U2 u2Rocket = new U2();

                if (u2Rocket.canCarry(item)){
                    u2Rocket.carry(item);
                    phaseCargo.remove(item);
                    u2RocketsArray.add(u2Rocket);
                } else {
                    break;
                }
            }
        }
        return u2RocketsArray;
    }

    int runSimulation() throws FileNotFoundException {
        ArrayList<Item> phaseOneCargo = loadItems(1);
        ArrayList<Item> phaseTwoCargo = loadItems(2);

        System.out.println("Phase 1 simulation using U1 Rockets");
        ArrayList<U1> phaseOneU1RocketsArray = loadU1(phaseOneCargo);

        System.out.println("Phase 2 simulation using U1 Rockets");
        ArrayList<U1> phaseTwoU1RocketsArray = loadU1(phaseTwoCargo);



        System.out.println("Phase 1 simulation using U2 Rockets");
        ArrayList<U2> phaseOneU2RocketsArray = loadU2(phaseOneCargo);

        System.out.println("Phase 2 simulation using U2 Rockets");
        ArrayList<U2> phaseTwoU2RocketsArray = loadU2(phaseTwoCargo);


    }






}
