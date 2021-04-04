package lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
        System.out.println("В тарелку добавили " + x + " корма.");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
