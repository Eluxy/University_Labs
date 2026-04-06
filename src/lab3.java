import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int j = 0;
        double itog = 0;
        for(int i = 1; i <= 100; i++){
            itog += i;
            j++;
        }
        System.out.println("ср. ар. = " + itog / j);

        //2
        System.out.println("Задание 2");
        int x = 5;
        int sum = 0;
        while(x <= 57){
            if(x == 34) {
                x++;
                continue;
            }
            else if(x == 46){
                x++;
                continue;
            }
            else if(x == 52){
                x++;
                continue;
            }
            sum += x;
            x++;
        }
        System.out.println("Сумма чисел от 5 до 57 = " + sum);

        //3
        System.out.println("Задание 3");
        int chislo = 1000;
        while(chislo != 0){
            if((chislo % 3) != 0){
                chislo--;
                continue;
            }
        System.out.println(chislo);
        chislo--;
        }

        //4
        System.out.println("Задание 4");
        Scanner console = new Scanner(System.in);
        int summa = 0;
        for(int c = 0; c < 5; c++){
            summa += console.nextInt();
        }
        int sr_arif = summa / 5;
        System.out.println("сумма = " + summa);
        System.out.println("среднее арифмитическое = " + sr_arif);


        //5
        System.out.println("Задание 5");
        int h = 1;
        for(h = 1; h <= 5; h++){
            int m;
            for(m = 0; m < h; m++) {
                System.out.print(h);
            }
            System.out.println();
        }

        //6
        System.out.println("Задание 6");
        int p = 1;
        int summ = 0;
        while(p <= 100){
            if((p % 4) != 0){
                p++;
                continue;
            }
            summ += p;
            p++;
        }
        System.out.println("Сумма кратных 4 = " + summ);

        //7
        System.out.println("Задание 7");
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Введите что нибудь: ");
            String li = scan.nextLine();

            if(li.equals("0")){
                break;
            }
            else if(li.equals("1")) {
                continue;
            }
            System.out.println("Вы ввели =" + li);
        }

        //8
        System.out.println("Задание 8");
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
