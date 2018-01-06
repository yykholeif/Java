public class Rocket implements SpaceShip{
    //fix these constructors
    public int costMillions;
    public int weight;
    public int maxWeight;
    private int currentCargoWeight = 0;


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
        int cargoLimit;
        cargoLimit = maxWeight - weight;
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
        return (currentCargoWeight + cargo.getWeight() <= getCargoLimit());
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


