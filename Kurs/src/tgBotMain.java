import java.util.Scanner;

public class tgBotMain {
    public static void main(String[] args) {
        System.out.println("Добрый день! Сейчас я задам вам несколько вопросов как начинающему джава разработчику");

        System.out.println("Вопрос 1. Сколько в языке программирования Java сть примитивов?");

        int primitivsCount = new Scanner(System.in).nextInt();
        if (primitivsCount == 8) {
            System.out.println("Всё верно");
        } else {
            System.out.println("Ответ не верный");
        }

        System.out.println("Вопрос 2. Сколько в реляционных (SQL) базах данных существует типов связей между таблицами?");

        int linkssCount = new Scanner(System.in).nextInt();
        if (linkssCount == 3) {
            System.out.println("Всё верно");
        } else {
            System.out.println("Ответ не верный");
        }

        System.out.println("Вопрос 3. С помощью какой команды в системе контроля версий Git можно посмотреть авторов разлиных строк в одном файле");

        String blameAnswer = new Scanner(System.in).nextLine().toLowerCase();
        if (blameAnswer.contains("blame")) {
            System.out.println("Всё верно");
        } else {
            System.out.println("Ответ не верный");
        }

        System.out.println("Вопрос 4. Какие методы HTTP-запросов вы знаете?");

        String httpAnswer = new Scanner(System.in).nextLine().toLowerCase();
        if (blameAnswer.contains("get") &&
                blameAnswer.contains("post") &&
            blameAnswer.contains("put") &&
                    blameAnswer.contains("patch") &&
                blameAnswer.contains("delete")){
            System.out.println("Всё верно");
        } else {
            System.out.println("Ответ не верный");
        }


    }
}
