package DESIGN_PATTERN.SINGLETON_DESIGN_PATTERN;

public class ThreadSafeDoubleLockingSingleton {
    private static ThreadSafeDoubleLockingSingleton instance;

    public ThreadSafeDoubleLockingSingleton(){
        System.out.println("Thread is Locking");
    }

    private static ThreadSafeDoubleLockingSingleton getInstance(){

        if (instance == null){
            synchronized (ThreadSafeDoubleLockingSingleton.class){
                if (instance == null){
                    instance = new ThreadSafeDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeDoubleLockingSingleton t1 = getInstance();
        ThreadSafeDoubleLockingSingleton t2 = getInstance();
        System.out.println(t1 == t2);
    }
}
