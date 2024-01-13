package wrong;

public class CoffeeOrder implements OrderService{

    @Override
    public void orderPizza() {
        System.out.println("pizza");
    }

    @Override
    public void orderBurger() {
        System.out.println("burger");

    }

    @Override
    public void orderShake() {
        System.out.println("shake");

    }
}
