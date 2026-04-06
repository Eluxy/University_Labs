import java.util.Scanner;
public class Lab4 {
    public static void func1(){
        System.out.println("Задание 1");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите a");
        int a = console.nextInt();
        System.out.println("Введите b");
        int b = console.nextInt();
        System.out.println("Введите c");
        int c = console.nextInt();
        System.out.println("Среднее арифмитическое " + ((a + b + c)*1.0/3));

    }

    public static void func2(){
        System.out.println("Задание 2");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите a");
        int a = console.nextInt();
        System.out.println("Введите b");
        int b = console.nextInt();
        if (a > b){
            System.out.println(a + " > " + b);
        }
        if (a < b){
            System.out.println(a + " < " + b);
        }
        if (a == b){
            System.out.println(a + " = " + b);
        }
    }

    public static void func3(String s1, String s2){
        System.out.println("Задание 3");
        System.out.println(s1 + " " + s2);
    }

    public static void func3(int a, int b){
        System.out.println("Задание 3");
        System.out.println(a + " " + b);
    }

    public static void func3(int a, boolean b){
        System.out.println("Задание 3");
        System.out.println(a + " " + b);
    }

    public static void func4(){
        System.out.println("Задание 4");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите возраст");
        int a = console.nextInt();
        if (a == 1 || a % 10 == 1 && a != 11){
            System.out.println(a + " год");
        }
        else if (a >= 2 && a <= 4 || a % 10 >= 2 && a % 10 <= 4 && a != 12 && a != 13 &&a != 14){
            System.out.println(a + " годa");
        }
        else{
            System.out.println(a + " лет");
        }
    }

    public static void func5(){
        System.out.println("Задание 5");
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int i = s.length();
        int count = 0;
        for (int j = 0; j < i; j++){
            char ch = s.charAt(j);
            if (ch == 'а' || ch == 'о' || ch == 'е' || ch == 'я' || ch == 'ю' || ch == 'и' || ch == 'э' || ch == 'у' || ch == 'ы' || ch == 'ё'){
                count++;
            }
        }
        System.out.println("Количество гласных " + count);

    }

    public static void main(String[] args) {
        func1();
        func2();
        func3("привет", "мир");
        func3(17, 19);
        func3(18, true);
        func4();
        func5();
    }

}
