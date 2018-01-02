public class Rocket implements SpaceShip{

    private double costMillions = 0;
    private double weightTonnes = 0;
    private double maxWeightTonnes = 0;

    SpaceShip(double cost, double weight, double maxWeight) {
        this.costMillions = cost;
        this.weightTonnes = weight;
        this.maxWeightTonnes = maxWeight;

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
        if(weightTonnes + item.weight <= maxWeightTonnes){
            return true;
        }
    }

    @Override
    public double carry(Item item) {
        if(canCarry()) {
            this.weightTonnes += item.weight;
        }
    }
}
