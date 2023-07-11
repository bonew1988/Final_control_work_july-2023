import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        try (Counter counter = new Counter(); Scanner scan = new Scanner(System.in)) {
            int menu = 0;
            while (menu != 6) {
                menu = Program.check_menu(View.menu(scan));
                if (menu == 0) {
                    menu = Program.check_menu(View.menu(scan));
                }
                switch (menu) {
                    case 1:
                        int animal = Program.check_menu(View.chous_animal(scan));
                        while (animal == 0) {
                            animal = Program.check_menu(View.chous_animal(scan));
                        }
                        add_animal(animals, animal, scan);
                        counter.add();
                        break;
                    case 2:
                        Program.get_list(animals);
                        break;
                    case 3:
                        int search_id = search_id(animals, scan);
                        if (search_id != -1) {
                            System.out.println(animals.get(search_id).toString());
                        } else {
                            System.out.println("Животного с таким Id нет !");
                        }
                        break;
                    case 4:
                        int id = search_id(animals, scan);
                        if (id != -1) {
                            animals.get(id).setOrder(View.new_question(scan, "Введите команды "));
                        } else {
                            System.out.println("Животного с таким Id нет !");
                        }
                        break;
                    case 5:
                        System.out.println(counter.getSum());
                        break;
                }
            }
        }
    }

    public static int search_id(List<Animal> animals, Scanner scan) {
        int id = Program.check_id(View.new_question(scan, "Введите Id "));
        return Program.search_animal(animals, id);
    }

    public static void add_animal(List<Animal> animals, int animal, Scanner scan) {

        switch (animal) {
            case 1:
                animals.add(
                        new Cat(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
            case 2:
                animals.add(
                        new Dog(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
            case 3:
                animals.add(
                        new Hamster(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
            case 4:
                animals.add(
                        new Horse(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
            case 5:
                animals.add(
                        new Camel(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
            case 6:
                animals.add(
                        new Donkey(animals.size() + 1, View.new_question(scan, "Введите имя "),
                                View.new_question(scan, "Введите дату рождения "),
                                View.new_question(scan, "Введите команды ")));
                break;
        }
    }
}
