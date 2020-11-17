package FactoryMethods;

import java.util.Random;

public class RandomCatFactory {
    private Random rg;

    enum CatTypes{
        Tabby,ScottishFold,BritishShortHair,Siamese
    };

    public RandomCatFactory(){
        rg = new Random();
    }

    public Cat createCat(){
        Cat cat = null;
        String catString = CatTypes.values()[rg.nextInt(CatTypes.values().length)].toString();
        try {
            cat = (Cat)Class.forName(catString).newInstance();
        }catch(Exception e){

        }
        cat.setName(cat.getClass().getSimpleName() + rg.nextInt(1000));
        return cat;
    }
}
