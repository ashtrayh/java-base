package lesson7;

public class SeventhLesson {

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Чимин", 20, false);
        allCats[1] = new Cat("Вишня", 15, false);
        allCats[2] = new Cat("Симба", 10, false);
        allCats[3] = new Cat("Лорд", 25, false);
        allCats[4] = new Cat("Мята", 20, false);

        Plate plate = new Plate(40);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            do {
                if (allCats[i].satiaty == false && allCats[i].appetite <= plate.food) {
                    allCats[i].eat(plate);
                    allCats[i].satiaty = true;
                    System.out.println("Кот " + allCats[i].name + " сыт.");
                } else {
                    System.out.println("Кот " + allCats[i].name + " голоден.");
                    plate.info();
                    plate.increaseFood(10);
                }
            } while (allCats[i].satiaty == false);
        }
    }
}
