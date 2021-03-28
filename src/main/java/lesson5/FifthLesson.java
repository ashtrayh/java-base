package lesson5;

public class FifthLesson {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Гарри Поттер", "Мальчик, который выжил", "hp@gmail.com", "+7 10 444058201", 1800, 25);
        persArray[1] = new Employee("Альбус Дамблдор", "Директор Хогвартса", "ad@gmail.com", "+7 10 444058202", 3255, 84);
        persArray[2] = new Employee("Гермиона Грейнджер", "Правозащитница домовых эльфов", "hg@gmail.com", "+7 10 444058203", 1630, 25);
        persArray[3] = new Employee("Северус Снейп", "Преподаватель Защиты от Тёмных Искусств", "ss@gmail.com", "+7 10 444058204", 2585, 54);
        persArray[4] = new Employee("Минерва МакГонагалл", "Преподаватель Трансфигурации", "mm@gmail.com", "+7 10 444058205", 2780, 72);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].getAge() > 40) persArray[i].print();
    }
}
