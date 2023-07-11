
import java.util.Scanner;

public class View {

    public static String menu(Scanner scan) {
        System.out.println("Список команд:\n" +
                "1 - Завести новое животное \n" +
                "2 - вывести список всех животных \n" +
                "3 - вывести данные животного по ID \n" +
                "4 - обучить животное новым командам\n" +
                "5 - показать количество животных \n" +
                "6 - выход \n");
        String text = scan.nextLine();
        return text;

    }

    public static String chous_animal(Scanner scan) {
        System.out.println("Выберите вид животного:\n" +
                "1 - кот\n" +
                "2 - собака\n" +
                "3 - хомяк\n" +
                "4 - лошадь\n" +
                "5 - верблюд\n" +
                "6 - осел\n");
        String text = scan.nextLine();
        return text;
    }

    public static String new_question(Scanner scan, String question) {
        System.out.println(question);
        String text = scan.nextLine();
        return text;
    }

}
