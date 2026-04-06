public class Solution {
    public static void main(String[] args) {
        Car CAR1 = new Car("Shevrolet", "Red", 1200);
        CAR1.Output();
        Car CAR2 = new Car("Blue", 1200);
        CAR2.Output();
        Car CAR3 = new Car("White");
        CAR3.Output();

        Truck Tru1 = new Truck("Reno", "white", 4500, 6, 3000);
        Tru1.Output_Truck();
        Tru1.newWheels(8);

        Truck Tru2 = new Truck("Mac", "white", 4000, 4, 2500);
        Tru2.Output_Truck();
        Tru2.newWheels(10);
        Tru2.Output_Truck();
    }
}
