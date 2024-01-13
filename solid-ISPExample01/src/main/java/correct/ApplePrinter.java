package correct;

public class ApplePrinter implements
        Printer,PrintColor,PrintScan {
    @Override
    public void printScan() {
        System.out.println("Apple scan printer");
    }
    @Override
    public void printColor() {
        System.out.println("Apple color printer");
    }
}
