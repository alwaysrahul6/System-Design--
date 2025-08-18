package DESIGN_PATTERN.SINGLETON_DESIGN_PATTERN;

public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon(){
        System.out.println("Singleton Constructor Called: ");
    }

    public static SingleTon getInstance(){
        if (instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

    public static void main(String[] args) {

        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();

        System.out.println(s1 == s2);

    }
}


