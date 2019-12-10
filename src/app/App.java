package app;

public class App {
    public static void main(String[] args) throws Exception {
        Coffee coffee = new Coffee();
        Whip coffeeWiphed = new Whip(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
        System.out.println(coffeeWiphed.getDescription());
        System.out.println(coffeeWiphed.getCost());
    }
}