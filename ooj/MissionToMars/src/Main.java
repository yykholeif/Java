import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();

        ArrayList<Item> cargo = simulation.loadItems(1);

        simulation.loadU1(cargo);
        simulation.loadU2(cargo);
        simulation.runSimulation(2);


        simulation.loadU1(simulation.loadItems(2));
        simulation.loadU2(simulation.loadItems(2));
        simulation.runSimulation(2);

    }
}
