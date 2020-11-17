package FactoryMethods;

public class ScottishFold extends Cat{
    public ScottishFold(String name, int lives){
        super(name, lives);
    }

    public ScottishFold(){
        super("Uknown", 20);
    }
}
