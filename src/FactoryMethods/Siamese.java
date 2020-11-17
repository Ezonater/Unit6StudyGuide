package FactoryMethods;

public class Siamese extends Cat{
    public Siamese(String name, int lives){
        super(name, lives);
    }

    public Siamese(){
        super("Uknown", 9);
    }
}
