import java.time.LocalDate;
public class House {
    int floars;
    private int build_year;
    private String house_name;

    public House(String house_name, int floars, int build_year){
        this.house_name = house_name;
        this.floars = floars;
        this.build_year = build_year;
    }

    public void Output(){
        System.out.println("Информация про дом: " + house_name);
        System.out.println("Наименование: " + house_name);
        System.out.println("Количество этажей: " + floars);
        System.out.println("Год постройки: " + build_year);
        System.out.println("Лет с постройки: " + (years()));

    }

    public int years() {
        int years = LocalDate.now().getYear();
        return years - build_year;
    }

    public static void main(String[] args) {
        House Sber = new House("Sber", 2, 1989);
        Sber.Output();
        House Macdac = new House("Macdac", 10, 1998);
        Macdac.Output();
    }
}

