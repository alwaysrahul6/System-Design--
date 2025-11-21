package SOLID_DESIGN_PRINCIPLE.ISP;  

public class ISP_VIOLATED {
    interface Machine{
        void print();
        void scan();
        void fax();
    }
    /// this is violating the Interface segentration rule the old printer can't support sacn and fax services
     static class oldPrinter implements Machine{
        @Override
        public void print() {
            System.out.println("Printing the paper");
        }

        @Override
        public void fax() {
            throw new UnsupportedOperationException("old printer cant support a fax services");
        }

        @Override
        public void scan() {
            throw new UnsupportedOperationException("old printer cant support scan services");
        }
    }

    public static void main(String[] args) {
        Machine printer = new oldPrinter();
        printer.print();
        printer.scan();  /// Error Throw --.UnsupportedOperationException: old printer cant support scan services
        printer.fax();  /// Error Throw ---..UnsupportedOperationException: old printer cant support a fax services
    }
}

