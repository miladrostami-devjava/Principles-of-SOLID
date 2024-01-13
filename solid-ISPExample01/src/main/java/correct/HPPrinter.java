package correct;

public class HPPrinter implements
        Printer,PrintBW,PrintScan,PrintDuplex,PrintColor {
    @Override
    public void printBW() {
        System.out.println("print (Front)");
        System.out.println("print (Back)");

    }

    @Override
    public void printScan() {
        System.out.println("Hp scan printer");
    }

    @Override
    public void printDuplex() {
        System.out.println("Hp duplex printer");

    }

    @Override
    public void printColor() {
        System.out.println("Hp color printer");

    }
}
