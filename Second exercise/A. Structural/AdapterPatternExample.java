// Target interface
interface Printer {
    void print(String message);
}

// Adaptee class
class LegacyPrinter {
    void oldPrint(String message) {
        System.out.println("Legacy print: " + message);
    }
}

// Adapter class
class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String message) {
        legacyPrinter.oldPrint(message);
    }
}

// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacyPrinter);
        printer.print("Hello World");
    }
}
