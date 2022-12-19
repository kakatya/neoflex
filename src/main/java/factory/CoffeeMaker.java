package factory;

public class CoffeeMaker {
    private final CoffeeFactory coffeeFactory = new CoffeeFactory();

    public void pourCoffee(CoffeeType coffeeType) {
        System.out.println("Наливаем " + coffeeFactory.getCoffee(coffeeType).getCoffee());
    }
}
