public class Rocket implements SpaceShip{

    private double costMillions;
    private double weightTonnes;
    private double maxWeightTonnes;
    private double cargoLimit;
    private int currentCargoWeight = 0;

    Rocket(double cost, double weight, double maxWeight) {
        this.costMillions = cost;
        this.weightTonnes = weight;
        this.maxWeightTonnes = maxWeight;
        //calculate cargo limit
        cargoLimit = maxWeight - weight;

    }

    //getter methods

    public double getCostMillions() {
        return costMillions;
    }

    public double getWeightTonnes() {
        return weightTonnes;
    }

    public double getMaxWeightTonnes() {
        return maxWeightTonnes;
    }

    public double getCargoLimit() {
        return cargoLimit;
    }

    public int getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    //setter methods

    public void setCurrentCargoWeight(int newCargoWeight) {
        currentCargoWeight = newCargoWeight;
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
    public boolean canCarry(Item item) {
        if(weightTonnes + item.getWeight() <= maxWeightTonnes){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double carry(Item item) {
        if (canCarry(item)) {
            this.weightTonnes += item.getWeight();
            return this.weightTonnes;
        } else {
            System.out.println("Cargo full, unable to add additional items current cargo weight is: ");}
            return weightTonnes;
    }


}
