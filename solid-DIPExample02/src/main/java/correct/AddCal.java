package correct;

public class AddCal implements CalculatorOperation {

    @Override
    public double calculate(double n1, double n2) {
        return n1 + n2;
    }
}
