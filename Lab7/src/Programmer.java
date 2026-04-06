public class Programmer extends Worker implements Programming{

    public Programmer(String Name){
        super(Name);
    }

    @Override
    public void Ability() {
        System.out.print("Я умею Програмировать!");
        System.out.println();
    }

    public void Voice() {
        super.Voice();
        Ability();
    }
}
