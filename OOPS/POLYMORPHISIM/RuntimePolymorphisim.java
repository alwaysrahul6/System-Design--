package OOPS.POLYMORPHISIM;

public class RuntimePolymorphisim {
    static class vehicles {
        void run() {

        }
    }

    static class bike extends vehicles {
        void run() {
            System.out.println("speed limit 220 km/h");
        }
    }

    static class car extends vehicles {
        void run() {
            System.out.println("Speed Limit 200 km/h ");
        }
    }

    static class truck extends vehicles {
        void run() {
            System.out.println("speed limit 160 km/h");
        }
    }

    public static void main(String[] args) {
        vehicles v;
        v = new bike();
        v.run();
        v = new car();
        v.run();
        v = new truck();
        v.run();

    }
}
