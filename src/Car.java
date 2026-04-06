
public class Car{
    public int car_weight;
    public String car_name;
    public String car_color;

    public Car(String car_name, String car_color, int car_weight) {
        this.car_name = car_name;
        this.car_color = car_color;
        this.car_weight = car_weight;
    }

    public Car(String car_name, String car_color) {
        this.car_name = car_name;
        this.car_color = car_color;
    }

    public Car(String car_color) {
        this.car_color = car_color;
    }

    public Car(String car_color, int car_weight) {
        this.car_color = car_color;
        this.car_weight = car_weight;
    }

    public Car(int car_weight) {
        this.car_weight = car_weight;
    }

    public Car() {
    }

    public void Output() {
        System.out.println("Информация про машину");
        if(car_name != null){
            System.out.println("Марка: " + car_name);
        }
        System.out.println("Цвет машины: " + car_color);
        if(car_weight != 0){
            System.out.println("Вес машины: " + car_weight + " кг");
        }
    }

    public static void main(String[] args) {
        Car Nom1 = new Car("Shevrolet", "Red", 1200);
        Nom1.Output();
        Car Nom2 = new Car("Blue", 1200);
        Nom2.Output();
        Car Nom3 = new Car();
        Nom3.Output();

    }
}