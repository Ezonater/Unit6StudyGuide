package FactoryMethods;

public class Tester {
    public static void main(String[] args) {
        RandomCatFactory rcf = new RandomCatFactory();
        while(true){
            System.out.println(rcf.createCat());
        }
    }
}
