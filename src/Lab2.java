import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Заданаие 1");
        Scanner console = new Scanner(System.in);
        System.out.print("введите число:");
        int money = console.nextInt();
        boolean shaurma = money < 500 && money >= 300;
        boolean burger = money < 300 && money >= 100;
        if(money >= 500){
            System.out.println("Купите пиццу");
        }
        else if (shaurma) {
            System.out.println("Купите шаурму");
        }
        else if (burger) {
            System.out.println("Купите Гамбургер");
        }
        if(money < 100){
            System.out.println("Купите Доширак");
        }
        //2
        System.out.println("Заданаие 2");
        System.out.print("введите первое число:");
        int x1 = console.nextInt();
        System.out.print("введите второе число:");
        int x2 = console.nextInt();
        if(x1 > x2)
            System.out.println("Первое число больше второго");
        else if (x2 > x1)
            System.out.println("Второе число больше первого");
        else
            System.out.println("Эти два числа равны");

        //3
        System.out.println("Заданаие 3");
        System.out.print("введите число:");
        int chislo = console.nextInt();
        if(chislo < 9 && chislo > 2)
            System.out.println("Число больше 2 и меньше 9");
        else
            System.out.println("Неизвестное число");

        //4
        System.out.println("Заданаие 4");
        System.out.print("введите сумму вклада:");
        int sum_vcklad = console.nextInt();
        if(sum_vcklad < 100000)
            System.out.println("Сумма вклада с процентами =" + (sum_vcklad + (sum_vcklad * 0.05)));
        else if(sum_vcklad >= 100000 && sum_vcklad <= 200000)
            System.out.println("Сумма вклада с процентами =" + (sum_vcklad + (sum_vcklad * 0.07)));
        else
            System.out.println("Сумма вклада с процентами =" + (sum_vcklad + (sum_vcklad * 0.1)));

        //5
        System.out.println("Заданаие 5");
        System.out.print("введите число:");
        int den = console.nextInt();
        switch (den){
            case 1:
                System.out.println("Понедельник");
            break;
            case 2:
                System.out.println("Вторник");
            break;
            case 3:
                System.out.println("Среда");
            break;
            case 4:
                System.out.println("Четверг");
            break;
            case 5:
                System.out.println("Пятница");
            break;
            case 6:
                System.out.println("Суббота");
            break;
            case 7:
                System.out.println("Воскресенье");
            break;
        }

        //6
        System.out.println("Заданаие 6");
        System.out.print("введите число:");
        int age = console.nextInt();
        String propusk = "Проходите в зал";
        String nepropusk = "Иди домой";
        System.out.println(age>18? propusk: nepropusk);
    }
}
