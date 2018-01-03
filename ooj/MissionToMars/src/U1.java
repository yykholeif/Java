public class U1 extends Rocket {

    /**
     * Rocket prototype =           U$1
     * Rocket cost =                $100 Million
     * Rocket weight =              10 Tonnes
     * Max weight (with cargo) =    18 Tonnes
     * Chance of launch explosion = 5% * (cargo carried / cargo limit)
     * Chance of landing crash =    1% * (cargo carried / cargo limit)
     */
    private double cargoTonnesCarried = 0;

    U1(double cost, double weight, double maxWeight, double cargoWeight) {
        super(cost, weight, maxWeight);
        cargoTonnesCarried = cargoWeight;
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 0.05 * (cargoTonnesCarried/getCargoLimit());
        return getRandomDouble() >= probabilityOfExplosion;
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 0.01 * (cargoTonnesCarried/getCargoLimit());
        return getRandomDouble() >= probabilityOfExplosion;
    }

    private double getRandomDouble() {
        double randomNumber = (double) Math.random();
        return randomNumber;
    }


}
