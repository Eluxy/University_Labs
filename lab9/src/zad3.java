import java.io.*;
import java.nio.file.NoSuchFileException;

public class zad3 {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String filePath = "D:\\test\\textbox.txt";

        // Создаем объект File для представления указанного файла
        File file = new File(filePath);

        // Пытаемся прочитать содержимое файла
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Содержимое файла " + filePath + ":");
            // Читаем файл построчно и выводим каждую строку в консоль
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("А файла то нету");

        }
        catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }

    }

}
