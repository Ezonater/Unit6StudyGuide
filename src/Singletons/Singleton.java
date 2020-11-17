package Singletons;



public class Singleton {
    private static Singleton firstInstance = null;



    public Singleton(){};

    public static Singleton getInstance(){
        if(firstInstance == null){
            firstInstance = new Singleton();
        }
        return firstInstance;
    }
}
