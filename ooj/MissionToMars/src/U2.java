
public class U2 extends Rocket {

    /**
     * Rocket prototype =           U$2
     * Rocket cost =                $120 Million
     * Rocket weight =              18 Tonnes
     * Max weight (with cargo) =    29 Tonnes
     * Chance of launch explosion = 4% * (cargo carried / cargo limit)
     * Chance of landing crash =    8% * (cargo carried / cargo limit)
     */
    private double cargoTonnesCarried = 0;

    U2(double cost, double weight, double maxWeight, double cargoWeight) {
        super(cost, weight, maxWeight);
        cargoTonnesCarried = cargoWeight;
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 0.04 * (cargoTonnesCarried/getCargoLimit());
        return getRandomDouble() >= probabilityOfExplosion;
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 0.08 * (cargoTonnesCarried/getCargoLimit());
        return getRandomDouble() >= probabilityOfExplosion;
    }

    private double getRandomDouble() {
        double randomNumber = (double) Math.random();
        return randomNumber;
    }
}
