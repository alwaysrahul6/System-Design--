package DESIGN_PATTERN.SINGLETON_DESIGN_PATTERN;

public class ThreadSafeLockingSingleton {

    private static ThreadSafeLockingSingleton insatnce;

    public ThreadSafeLockingSingleton(){
        System.out.println("Thread Safe But Waste Of Memory");
    }

    private static ThreadSafeLockingSingleton getInstance(){
        synchronized (ThreadSafeLockingSingleton.class){
            if (insatnce == null){
                insatnce = new ThreadSafeLockingSingleton();
            }
            return insatnce;
        }
    }

    public static void main(String[] args) {
    ThreadSafeLockingSingleton t1 = getInstance();
    ThreadSafeLockingSingleton t2 = getInstance();
        System.out.println(t1 == t2);
    }
}
