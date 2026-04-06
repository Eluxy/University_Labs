public class Driver extends Worker implements Driving{

    public Driver(String Name) {
        super(Name);
    }

    public void Ability() {
        System.out.print("Я умею водить!");
        System.out.println();
    }

    public void Voice() {
        super.Voice();
        Ability();
    }
}
