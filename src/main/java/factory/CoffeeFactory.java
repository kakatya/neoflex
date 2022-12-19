package factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Такого кофе нет в наличии");
        }
        return coffee;
    }

}
