//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задание 1");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        System.out.println(colorList);

        System.out.println("Задание 2");
        System.out.print("Введите цвет на который вы хотите заменить: ");
        String color = console.nextLine();
        System.out.print("Введите индекс элемента который вы хотите заменить: ");
        int index = console.nextInt();
        if (index >= 0 && index < colorList.size()){
            colorList.remove(index);
            colorList.add(index, color);
        }

        System.out.println("Обновленный список цветов:");
        System.out.println(colorList);

        System.out.println("Задание 3");
        ArrayList<String> copyclList = new ArrayList<>(colorList.subList(0, 3));
        System.out.println(copyclList);


        System.out.println("Задание 4");

        ArrayList<String> colorListn2 = new ArrayList<>();
        ArrayList<Boolean> sravnenie = new ArrayList<>();
        colorListn2.add("Red");
        colorListn2.add("Green");
        colorListn2.add("Orange");
        colorListn2.add("Yellow");
        colorListn2.add("Black");

        for(int i = 0; i < colorList.size(); i++){
            boolean result = colorList.get(i).equals(colorListn2.get(i));
            sravnenie.add(result);
        }

        System.out.println(sravnenie);

        System.out.println("Задание 5");
        System.out.println(colorList);
        Collections.shuffle(colorList);
        System.out.println("Перемешанный лист");
        System.out.println(colorList);

    }


}