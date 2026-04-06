import java.io.*;

public class zad4 {
    public static void main(String[] args) {
        String filename = "D:\\test\\myfile.txt";
        String textToAdd = "Java - строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems";

        try {
            // Создаем объект FileWriter с флагом true для добавления текста в конец файла
            FileWriter fileWriter = new FileWriter(filename, true);

            // Создаем объект BufferedWriter для более эффективной записи
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Добавляем текст в файл
            bufferedWriter.write(textToAdd);
            bufferedWriter.newLine(); // Добавляем новую строку

            // Закрываем BufferedWriter
            bufferedWriter.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода: " + e.getMessage());
        }
    }

}
