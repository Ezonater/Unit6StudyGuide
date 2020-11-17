package FactoryMethods;

abstract public class Cat {
    private String name;
    private int lives;

    public Cat(String name, int lives){
        this.name = name;
        this.lives = lives;
    }

    public Cat(){
        this.name = "Uknown";
        this.lives = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String toString(){
        return name + ", " + lives + " lives.";
    }
}
