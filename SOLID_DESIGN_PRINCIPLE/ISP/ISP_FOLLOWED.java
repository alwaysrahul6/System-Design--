package SOLID_DESIGN_PRINCIPLE.ISP;
/*      *  Interface Segregation Principle (ISP)
        *           Definition:
        *           Clients should not be forced to depend on interfaces they do not use.
        *           ✅ Why it matters:
        *           Smaller, specific interfaces = better modularity.
        *           Avoids unnecessary code implementation.
        *           🔧 Example (Wrong)
        *           interface MultiFunctionPrinter {
        *               void print();
        *               void scan();
        *               void fax();
        *           }
        *           class OldPrinter implements MultiFunctionPrinter {
        *               public void print() { ... }
        *               public void scan() { throw new UnsupportedOperationException(); }
        *               public void fax() { throw new UnsupportedOperationException(); }
                    }*/
public class ISP_FOLLOWED {
    interface Printing {
        void print();
    }

    interface Scanner {
        void scan();
    }

    interface Fax {
        void fax();
    }

    static class oldPrinter implements Printing {
        @Override
        public void print() {
            System.out.println("Printer device Printing The Document");
        }
    }

    static class newprinter implements Printing, Scanner, Fax {
        public void print() {
            System.out.println("device printing");
        }

        public void scan() {
            System.out.println("Device has scan Document:");
        }

        public void fax() {
            System.out.println("Devices Has Faxed The Document:");
        }
    }

    public static void main(String[] args) {
        Printing a = new oldPrinter();
        a.print();
        newprinter b = new newprinter();
        b.print();
        b.scan();
        b.fax();
    }
}
