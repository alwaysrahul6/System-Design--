package onlineLearning;

interface PaymentMethod {
    void pay(double amount);
}

class creditcard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paid ₹" + amount + "Using credit card");
    }
}

class upi implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paid ₹" + amount + "Using Upi");
    }
}

/// Inheritance

class user {
    String name;
}


/// aggregation 

class Category {
    String name;
}

class Cource {
    Category category;
    Video video = new Video();
}

/// compostion

class Video {
    String url;
}

/// Dependency

class NotificationServices {
    void sendEmail(String message) {
        System.out.println("Email sent" + message);
    }
}

class Student extends user {

    void enroll(Cource cource) {
        System.out.println("Entrolled in cource ");
    }

    void notify(NotificationServices service) {
        service.sendEmail("Welcome");
    }
}

class payment {
    void process(PaymentMethod mathod) {
        mathod.pay(100.0);
    }
}

public class couresewallh {
    public static void main(String[] args) {
        Student s = new Student();
        s.enroll(new Cource());

        NotificationServices ns = new NotificationServices();
        s.notify(ns);

        PaymentMethod method = new upi();
        new payment().process(method);
    }
}
