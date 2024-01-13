package correct;

public class Calculator {
    private final CalculatorOperation operation;

    public Calculator(CalculatorOperation operation) {
        this.operation = operation;
    }
    public  double solve(double n1,double n2){
        return operation.calculate(n1,n2);
    }
}
