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
    ArrayList<U1> loadU1(ArrayList<Item> phaseCargo) throws Exception {
        ArrayList<U1> u1RocketsArray = new ArrayList<U1>();

            //create a loop to iterate and fill up rockets one by one
            U1 u1Rocket = new U1();
            for (Item item : phaseCargo) {
                    System.out.println(item);
                    if (u1Rocket.canCarry(item)){
                        u1Rocket.carry(item);
                        phaseCargo.remove(item);
                    } else if (!u1Rocket.canCarry(item)) {
                        u1RocketsArray.add(u1Rocket);
                        u1Rocket = new U1();
                    }
            }
        System.out.println(u1RocketsArray);
        return u1RocketsArray;
    }

    //load U2 rockets with Cargo
    ArrayList<U2> loadU2(ArrayList<Item> phaseCargo) throws Exception {
        ArrayList<U2> u2RocketsArray = new ArrayList<U2>();

        U2 u2Rocket = new U2();
        for (Item item : phaseCargo) {
            System.out.println(item);
            if (u2Rocket.canCarry(item)){
                u2Rocket.carry(item);
                phaseCargo.remove(item);
            } else if (!u2Rocket.canCarry(item)) {
                u2RocketsArray.add(u2Rocket);
                u2Rocket = new U2();
            }
        }
        System.out.println(u2RocketsArray);
        return u2RocketsArray;
    }

    void runSimulation(int phaseNumber) throws Exception {

        //U1 Rocket Simulation
        System.out.println("U1 Rockets Simulation");
        ArrayList<Item> phaseCargo = loadItems(phaseNumber);
        ArrayList<U1> u1RocketsArray = loadU1(phaseCargo);

        int rocketCount = 0;
        int totalBudgetMillions = 0;

        for (U1 rocket : u1RocketsArray) {
            if (!rocket.launch() || !rocket.land()) {
                System.out.println("rocket exploded on take-off or landing");
                rocket.launch(); //not sure if this works like a while loop, if this returns true will it retry if statement?
                rocketCount ++;
            } else {
                System.out.println("Rocket Successfully landed on Mars. Rocket Number: " + u1RocketsArray.indexOf(rocket));
                rocketCount ++;
            }
            totalBudgetMillions = 100 * rocketCount;
        }
        System.out.println("Phase: " + phaseNumber);
        System.out.println("U1 total mission budget: $" + totalBudgetMillions);


        //U2 Rocket Simulation
        System.out.println("U2 Rockets Simulation ");
        ArrayList<U2> u2RocketsArray = loadU2(phaseCargo);

        rocketCount = 0;
        totalBudgetMillions = 0;

        for (U2 rocket : u2RocketsArray) {
            if (!rocket.launch() || !rocket.land()) {
                System.out.println("rocket exploded on take-off or landing");
                rocket.launch(); //not sure if this works like a while loop, if this returns true will it retry if statement?
                rocketCount ++;
            } else {
                System.out.println("Rocket Successfully landed on Mars. Rocket Number: " + u2RocketsArray.indexOf(rocket));
                rocketCount ++;
            }
            totalBudgetMillions = 120 * rocketCount;
        }
        System.out.println("Phase: " + phaseNumber);
        System.out.println("U2 total mission budget: $" + totalBudgetMillions);

    }


// DRY up code by inputting phase 2 parameters: create seperate function for redundant code. get down to 100 lines
// load phase 1/2 can be 1 function with parameter
    //1 function for runSimulation as well




}
