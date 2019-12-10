package app;

/**
 * Whip
 */
public class Whip extends Extra {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 5;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}