package FactoryMethods;

public class BritishShortHair extends Cat{
    public BritishShortHair(String name, int lives){
        super(name, lives);
    }

    public BritishShortHair(){
        super("Uknown", 7);
    }
}
