package wrong;

public class ApplePrinter implements Printer{
    @Override
    public void printBW() {
        throw new RuntimeException("Not Supported");
    }

    @Override
    public void printScan() {
        System.out.println("Apple scan printer");

    }

    @Override
    public void printDuplex() {
        throw new RuntimeException("Not Supported");

    }

    @Override
    public void printColor() {
        System.out.println("Apple color printer");

    }
}
