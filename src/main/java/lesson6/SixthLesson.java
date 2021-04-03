package lesson6;

public class SixthLesson {
    public static void main(String[] args) {
        int animalCount = 0;
        int catCount = 0;
        int dogCount = 0;

        Cat cat1 = new Cat();
        cat1.run(157);
        animalCount++;
        catCount++;

        Cat cat2 = new Cat();
        cat2.run(356);
        cat2.swim(3);
        animalCount++;
        catCount++;

        Cat cat3 = new Cat();
        cat3.run(-150);
        animalCount++;
        catCount++;

        Dog dog1 = new Dog();
        dog1.run(490);
        dog1.swim(5);
        animalCount++;
        dogCount++;

        Dog dog2 = new Dog();
        dog2.run(580);
        dog2.swim(12);
        animalCount++;
        dogCount++;

        Dog dog3 = new Dog();
        dog3.run(-580);
        dog3.swim(-12);
        animalCount++;
        dogCount++;

        System.out.println("Общее количество котов = " + catCount);
        System.out.println("Общее количество собак = " + dogCount);
        System.out.println("Общее количество животных = " + animalCount);
    }
}
