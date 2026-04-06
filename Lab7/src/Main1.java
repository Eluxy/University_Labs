//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog();
        Rex.speak();
        Cat Barsik = new Cat();
        Barsik.speak();
        Space_Ship Apolon = new Space_Ship();
        Apolon.fly_obj();
        Airplane Boing = new Airplane();
        Boing.fly_obj();
        Helicopter An_24 = new Helicopter();
        An_24.fly_obj();

        Programmer Semen = new Programmer("Семён");
        Programmer Artem = new Programmer("Артём");
        Programmer Vasya = new Programmer("Вася");
        Semen.Voice();
        Artem.Voice();
        Vasya.Voice();
        Cook Nata = new Cook("Наташа");
        Cook Vanya = new Cook("Ваня");
        Cook Petr = new Cook("Пётр");
        Nata.Voice();
        Vanya.Voice();
        Petr.Voice();
        Driver Nikolay = new Driver("Николай");
        Driver Arkadiy = new Driver("Аркадий");
        Driver Alex = new Driver("Алексей");
        Nikolay.Voice();
        Arkadiy.Voice();
        Alex.Voice();
    }
}