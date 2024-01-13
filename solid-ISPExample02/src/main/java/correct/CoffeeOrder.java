package correct;

public class CoffeeOrder implements
        OrderService,OrderShake,OrderPizza,OrderBurger {



    @Override
    public void orderShake() {
        System.out.println("shake");

    }

    @Override
    public void orderBurger() {
        System.out.println("burger");

    }

    @Override
    public void orderPizza() {
        System.out.println("pizza");

    }
}
