package correct;

public class RestaurantOrder implements
        OrderService,OrderBurger,OrderPizza {

    @Override
    public void orderPizza() {
        System.out.println("pizza");
    }

    @Override
    public void orderBurger() {
        System.out.println("burger");

    }


}