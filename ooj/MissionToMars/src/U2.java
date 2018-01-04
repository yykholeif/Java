
public class U2 extends Rocket {

    /**
     * Rocket prototype =           U$2
     * Rocket cost =                $120 Million
     * Rocket weight =              18 Tonnes
     * Max weight (with cargo) =    29 Tonnes
     * Chance of launch explosion = 4% * (cargo carried / cargo limit)
     * Chance of landing crash =    8% * (cargo carried / cargo limit)
     */
    private int cargoTonnesCarried = 0;

    U2() {
        super();
        int costMillions = 120;
        int weight = 18000;
        int maxWeight = 29000;
        cargoTonnesCarried = getCurrentCargoWeight();
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
