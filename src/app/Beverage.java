package app;

/**
 * Beverage
 */
public abstract class Beverage {

    private String description;

    public abstract double getCost();

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}