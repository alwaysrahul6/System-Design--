package DESIGN_PATTERN.OBSERVER_DESIGN_PATTERN;

public class main {
    public static void main(String[] args) {

        Channel channel = new Channel("Coder Army");
        Subscriber sub1 = new Subscriber("Siba" , channel);
        Subscriber sub2 = new Subscriber("Rahul" , channel);
        Subscriber sub3 = new Subscriber("Ramji" , channel);
        Subscriber sub4 = new Subscriber("Sneha" , channel);
        Subscriber sub5 = new Subscriber("Ayush" , channel);
        Subscriber sub6 = new Subscriber("Ishant" , channel);
        Subscriber sub7 = new Subscriber("Gytri" , channel);
        Subscriber sub8 = new Subscriber("Ujjwal" , channel);

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);
        channel.subscribe(sub4);
        channel.subscribe(sub5);
        channel.subscribe(sub6);
        channel.subscribe(sub7);
        channel.subscribe(sub8);

        channel.uploadVideo("Observer Design pattern");

        channel.unSubscribe(sub1);



        channel.uploadVideo("Decorator Design pattern");

        channel.uploadVideo("Strategy Design Pattern");

    }
}
