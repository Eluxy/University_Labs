import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class LAb5 {
    public static void func1() {
        System.out.println("Задание 1");
        int[] array = {10, 21, 45, 232, 433, 122};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальное число из массива " + max);
    }

    public static void func2() {
        System.out.println("Задание 2");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int N = console.nextInt();
        int[] array = new int[N];
        int buf = 0;
        System.out.println("Введите элемнты массива: ");
        for(int i = 0; i < array.length; i++){
            array[i] = console.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void func3() {
        System.out.println("Задание 3");
        int[] array = {24, -63, 67, -12, 88, 94, -28, 82, 0, 53};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }

    public static void func4() {
        System.out.println("Задание 4");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int N = console.nextInt();
        int[] array = new int[N];
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        System.out.println("Введите элемнты массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (min == second_min) {
                if (array[i] < min) {
                    min = array[i];
                } else {
                    second_min = array[i];
                }
            } else if (array[i] < min) {
                second_min = min;
                min = array[i];
            } else if (array[i] > min && array[i] < second_min) {
                second_min = array[i];

            }
        }
        System.out.println(second_min);
    }

    public static void func5() {
        int i = 0;

        int[][] arr = { { 0, 34, 2 }, { 9, 12, 18, 5 }, { 3, 4, 5 } };
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void func6() {
        String[][] names = {
                {"Elena", "341"},
                {"Thomas", "273"},
                {"Hamilton", "294"},
                {"Suzie", "402"},
                {"Phil", "401"},
                {"Matt", "388"}
        };
        int max = Integer.parseInt(names[0][1]);
        String fastest = names[0][0];
        for(int i = 1; i < names.length; i++){
            int time = Integer.parseInt(names[i][1]);
            if(time < max){
                max = time;
                fastest = names[i][0];
            }
        }
        System.out.println("Самый быстрый " + fastest + " Время " + max);
    }
    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5();
        func6();
    }
}
