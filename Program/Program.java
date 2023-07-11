import java.util.List;

public class Program {

    public static int check_menu(String text) {
        try {
            int menu = Integer.parseInt(text);
            if (menu < 1 || menu > 6) {
                throw new Exception();
            }
            return menu;
        } catch (Exception e) {
            System.out.println("Вы ввели некорректную команду !");
        }

        return 0;
    }


    public static void get_list(List<Animal> animals) {
        if (animals.size() != 0) {
            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }
        } else {
            System.out.println("Нет животных на ферме !");
        }

    }

    public static int check_id(String text) {
        try {
            int menu = Integer.parseInt(text);
            return menu;
        } catch (Exception e) {
            System.out.println("Id должен состоять только из чисел !");
        }
        return 0;
    }

    public static int search_animal(List<Animal> animals, int id) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
