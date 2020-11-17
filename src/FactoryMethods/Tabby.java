package FactoryMethods;

public class Tabby extends Cat{
    public Tabby(String name, int lives){
        super(name, lives);
    }

    public Tabby(){
        super("Uknown", 2);
    }
}
