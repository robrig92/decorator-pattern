package app;

/**
 * Coffee
 */
public class Coffee extends Beverage {

    public Coffee() {
        setDescription("Coffee");
    }

    @Override
    public double getCost() {
        return 10;
    }
}