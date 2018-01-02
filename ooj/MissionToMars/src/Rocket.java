public class Rocket implements SpaceShip{

    private double costMillions = 0;
    private double weightTonnes = 0;
    private double maxWeightTonnes = 0;

    Rocket(double cost, double weight, double maxWeight) {
        this.costMillions = cost;
        this.weightTonnes = weight;
        this.maxWeightTonnes = maxWeight;

    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        if(weightTonnes + item.weight <= maxWeightTonnes){
            return true;
        } else {
            return false;
        }
    }

    public double carry(Item item) {
        if (canCarry(item)) {
            this.weightTonnes += item.weight;
            return this.weightTonnes;
        } else {
            System.out.println("Cargo full, unable to add additional items current cargo weight is: ");}
            return weightTonnes;
    }
}
