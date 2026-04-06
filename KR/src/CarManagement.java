import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarManagement {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Corolla", "ABC123", 2015, 75000, 15000));
        cars.add(new Car("Honda Civic", "XYZ789", 2018, 50000, 18000));
        cars.add(new Car("Ford Focus", "DEF456", 2012, 120000, 8000));

        Car cheapestCar = findCheapestCar(cars);
        System.out.println("Самая дешёвая машина: " + cheapestCar);

        sortCarsByYearDescending(cars);
        System.out.println("Отсартированые машины (убывание):");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.print("Введите номер машины: ");
        Scanner console = new Scanner(System.in);
        String regNumber = console.nextLine();
        Car foundCar = findCarByRegNumber(cars, regNumber);
        if (foundCar != null) {
            System.out.print("Что вы хотите поменять(price, year, mileage, regNumber): ");
            String change = console.nextLine();
            if(change.equals("price")){
                System.out.print("На что заменить: ");
                int NewPrice = console.nextInt();
                foundCar.setPrice(NewPrice);
            }
            if(change.equals("year")){
                System.out.print("На что заменить: ");
                int NewYear = console.nextInt();
                foundCar.setYear(NewYear);
            }
            if(change.equals("mileage")){
                System.out.print("На что заменить: ");
                int NewMileage = console.nextInt();
                foundCar.setMileage(NewMileage);
            }
            if(change.equals("regNumber")){
                System.out.print("На что заменить: ");
                String NewNumber = console.nextLine();
                foundCar.setRegNumber(NewNumber);
            }
            System.out.println("Обнавлённая машина: " + foundCar);
        } else {
            System.out.println("Машина с номером: " + regNumber + "не найдена.");
        }

    }

    public static Car findCheapestCar(List<Car> cars) {
        return Collections.min(cars, (car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()));
    }

    public static void sortCarsByYearDescending(List<Car> cars) {
        cars.sort((car1, car2) -> Integer.compare(car2.getYear(), car1.getYear()));
    }

    public static Car findCarByRegNumber(List<Car> cars, String regNumber) {
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        return null;
    }
}
