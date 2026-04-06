import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //1
        System.out.println("Я помню чудное мгновение");
        System.out.println("Передо мной явилась ты");
        System.out.println("Как мимолетное видение");
        System.out.println("Как гений чистой красоты!");

        System.out.println("Задание 2");
        //2
        int x = 12321;
        double y = 345.543;
        String s = "Иван";
        char c = 'z';
        boolean v = false;

//        System.out.println("Задание 3");
//        //3
//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите имя");
//        String name = console.nextLine();
//        System.out.println("Введите возраст");
//        int age = console.nextInt();
//        System.out.println("Введите рост");
//        int height = console.nextInt();
//        System.out.println("Имя:" + name);
//        System.out.println("Возраст:" + age);
//        System.out.println("Ррст:" + height);

        System.out.println("Задание 4");
        //4
        int x1 = 2023;
        int x2 = 8;
        int god = x1 - x2;
        System.out.println("Год рождения Друга:" + god);

        //5
        System.out.println("Задание 5");
        int kol_d = 5000;
        int kol_l = kol_d/365;
        int ost = 5000 % 365;
        int kol_m = ost / 30;
        int kol_day = ost % 30;
        System.out.println("В 5000 днях:" + kol_l + " лет " + kol_m + " месяцев " + kol_day + " дней");

        //6
        System.out.println("Задание 6");
        Scanner con = new Scanner(System.in);
        System.out.println("Введите a");
        int a = con.nextInt();
        System.out.println("Введите b");
        int b = con.nextInt();
        System.out.println("Сложение:" + (a + b));
        System.out.println("Вычитание:" + (a - b));
        System.out.println("Умножение:" + (a * b));
        System.out.println("Деление:" + (a / b));
        System.out.println("Остаток от деления:" + (a % b));

        //7
        System.out.println("Задание 7");
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите сторону a");
        int st_a = cons.nextInt();
        System.out.println("Введите сторону b");
        int st_b = cons.nextInt();
        System.out.println("Периметр треугольника:" + ((st_a*2) + (st_b*2)));
        System.out.println("Плошадь треугольникака:" + (st_a * st_b));

    }
}
