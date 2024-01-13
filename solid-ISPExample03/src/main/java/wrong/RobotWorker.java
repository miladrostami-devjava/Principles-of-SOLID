package wrong;

public class RobotWorker implements Worker{
    @Override
    public void eat() {
throw new RuntimeException("not supported");
    }

    @Override
    public void sleep() {
        throw new RuntimeException("not supported");

    }

    @Override
    public void work() {
        System.out.println("work");

    }
}
