package OOPS;

interface PaymentGateWay {
    void pay(double amount);
}
class carpayment implements PaymentGateWay{
    public void pay(double amount){
        System.out.println("Proccesing ₹ " + amount + "via cards");
        System.out.println("Verifying Details....");
        System.out.println("Payment done Using credit/debit cards");
    }
}

class upiPayment implements PaymentGateWay{
    public void pay(double amount){
        System.out.println("Proccesing  ₹ " + amount + " via upi");
        System.out.println("contacting upi Server");
        System.out.println("Payment done using upi ");
    }
}

class  netbanking implements PaymentGateWay{
    public void pay(double amount){
        System.out.println("Proccesing ₹ " + amount + "via netBanking");
        System.out.println("Connnecting Bank Server");
        System.out.println("Payment Done using netBanking");
    }
}
public class ABSTRACTION {
    public static void main(String[] args) {
        PaymentGateWay payment;

        payment = new carpayment();
        payment.pay(1000);
        System.out.println("--------------------------");

        payment = new netbanking();
        payment.pay(2000);
        System.out.println("---------------------------");

        payment = new upiPayment();
        payment.pay(3000);
        System.out.println("----------------------------");
    }

}
