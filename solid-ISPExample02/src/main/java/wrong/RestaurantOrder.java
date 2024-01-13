package wrong;

public class RestaurantOrder implements OrderService{

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
throw new RuntimeException("not supported!!!");
    }
}
