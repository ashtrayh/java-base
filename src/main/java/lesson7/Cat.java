package lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiaty;
    public Cat(String name, int appetite, boolean satiaty) {
        this.name = name;
        this.appetite = appetite;
        this.satiaty = satiaty;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
