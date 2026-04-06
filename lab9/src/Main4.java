import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            System.out.print("Введите число:");
            int i = console.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка");
        }
    }
}