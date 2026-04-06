import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        LinkedList<String> colorLnkid = new LinkedList<>();
        colorLnkid.add("Red");
        colorLnkid.add("Green");
        colorLnkid.add("Orange");
        colorLnkid.add("White");
        colorLnkid.add("Black");

        System.out.println(colorLnkid);


        colorLnkid.add(3, "Yellow");

        System.out.println(colorLnkid);

        System.out.println("Задание 2");

        colorLnkid.addLast("Blue");
        colorLnkid.addFirst("Purple");

        System.out.println(colorLnkid);

        System.out.println("Задание 3");

        String[] colors = {"Magenta", "Mint"};

        colorLnkid.addAll(1, Arrays.asList(colors));

        System.out.println(colorLnkid);

        System.out.println("Задание 4");
        for(int i = 0; i < colorLnkid.size(); i++){
            System.out.println("Элемент с индексом " + i + " " + colorLnkid.get(i));
        }

        System.out.println("Задание 5");

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        LinkedList<String> names = new LinkedList<>();
        names.add("Вася");
        names.add("Саша");
        names.add("Яша");
        names.add("Маша");
        names.add("Коля");
        names.add("Валя");
        names.add("Катя");
        names.add("Антон");
        names.add("Аля");
        names.add("Егор");

        LinkedList<String> Name_and_num = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            Name_and_num.add(numbers.get(i) + " " + names.get(i));
        }

        for (String item : Name_and_num) {
            System.out.println(item);
        }
    }
}
