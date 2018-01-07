public class U1 extends Rocket {

    /**
     * Rocket prototype =           U$1
     * Rocket cost =                $100 Million
     * Rocket weight =              10 Tonnes
     * Max weight (with cargo) =    18 Tonnes
     * Chance of launch explosion = 5% * (cargo carried / cargo limit)
     * Chance of landing crash =    1% * (cargo carried / cargo limit)
     */
    private int cargoTonnesCarried = 0;

    U1() {
        super();
        costMillions = 100;
        weight = 10000;
        maxWeight = 18000;
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 5 * (getCurrentCargoWeight()/getCargoLimit());
        return getRandomInt() >= probabilityOfExplosion;
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 1 * (getCurrentCargoWeight()/getCargoLimit());
        return getRandomInt() >= probabilityOfExplosion;
    }

}

//test