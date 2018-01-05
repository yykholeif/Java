public class Rocket implements SpaceShip{

    private int costMillions;
    private int weight;
    private int maxWeight;
    private int cargoLimit;
    private int currentCargoWeight = 0;


    Rocket() {
        this.costMillions = costMillions;
        this.weight = weight;
        this.maxWeight = maxWeight;
        //calculate cargo limit
        cargoLimit = maxWeight - weight;

    }

    //getter methods

    public int getCostMillions() {
        return costMillions;
    }

    public int getWeightTonnes() {
        return weight;
    }

    public int getMaxWeightTonnes() {
        return maxWeight;
    }

    public int getCargoLimit() {
        return cargoLimit;
    }

    public int getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    //setter methods

    public void addCurrentCargoWeight(Item cargo) {
        currentCargoWeight += cargo.getWeight();
    }



    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item cargo) {
        return (this.currentCargoWeight + cargo.getWeight() <= getCargoLimit());
    }

    @Override
    public void carry(Item cargo) {
        if (canCarry(cargo)) {
            //no need to call weight as this is handled in setter
            addCurrentCargoWeight(cargo);
        } else {
            System.out.println("Cargo full, unable to add additional items.");
        }
    }


}
