package lesson6;

abstract class Animals {

    private final int maxRun = 0;
    private final int maxSwim = 0;

    abstract void run(int length);
    abstract void swim(int length);
}

class Cat extends Animals {
    private final int maxRun = 200;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= maxRun))
            System.out.println("Кот пробежал " + length + " м.");
        else System.out.println("Кот не может столько пробежать.");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не умеет плавать.");
    }
}

class Dog extends Animals {
    private final int maxRun = 500;
    private final int maxSwim = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= maxRun))
            System.out.println("Пёс пробежал " + length + " м.");
        else System.out.println("Пёс не может столько пробежать.");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= maxSwim))
            System.out.println("Пес проплыл " + length + " м.");
        else System.out.println("Пес не может столько проплыть.");
    }
}


