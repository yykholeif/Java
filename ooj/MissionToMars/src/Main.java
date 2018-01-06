import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        ArrayList<Item> phase1cargo = simulation.loadItems(1);
        System.out.println("\n");

        simulation.loadU1(phase1cargo);
        System.out.println("\n");

        simulation.runSimulation(1);
        System.out.println("\n\n\n");

        ArrayList<Item> phase2cargo = simulation.loadItems(2);
        simulation.loadU1(phase2cargo);
        simulation.runSimulation(2);

    }
}
