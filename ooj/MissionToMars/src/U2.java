
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
        costMillions = 120;
        weight = 18000;
        maxWeight = 29000;
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 4 * (getCurrentCargoWeight()/getCargoLimit());
        return getRandomInt() >= probabilityOfExplosion;
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 8 * (getCurrentCargoWeight()/getCargoLimit());
        return getRandomInt() >= probabilityOfExplosion;
    }

}
