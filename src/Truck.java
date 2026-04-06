public class Truck extends Car{
    public int col_Wheels;
    public int max_weight;

    public Truck(String car_name, String car_color, int car_weight, int col_Wheels, int max_weight) {
        super(car_name, car_color, car_weight);
        this.col_Wheels = col_Wheels;
        this.max_weight = max_weight;
    }
    public Truck(String car_color, int car_weight, int col_Wheels, int max_weight) {
        super(car_color, car_weight);
        this.col_Wheels = col_Wheels;
        this.max_weight = max_weight;
    }
    public Truck(String car_name, String car_color, int col_Wheels, int max_weight) {
        super(car_name, car_color);
        this.col_Wheels = col_Wheels;
        this.max_weight = max_weight;
    }

    public Truck(int car_weight, int col_Wheels, int max_weight) {
        super(car_weight);
        this.col_Wheels = col_Wheels;
        this.max_weight = max_weight;
    }

    public void newWheels(int newWheelCount) {
        col_Wheels = newWheelCount;
        System.out.println("Установлено новое количество колес: " + col_Wheels);
    }

    public void Output_Truck() {
        super.Output();
        System.out.println("Количество колес: " + col_Wheels);
        System.out.println("Максимальный вес: " + max_weight + " кг");
    }

    public static void main(String[] args) {
        Truck nom1 = new Truck("Reno", "white", 4500, 6, 3000);
        nom1.Output_Truck();
        nom1.newWheels(8);

        Truck nom2 = new Truck("Mac", "white", 4000, 4, 2500);
        nom2.Output_Truck();
        nom2.newWheels(10);
        nom2.Output_Truck();
    }
}
