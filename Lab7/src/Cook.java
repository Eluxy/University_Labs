public class Cook extends Worker implements Cooking{

    public Cook(String Name){
        super(Name);
    }

    public void Ability() {
        System.out.print("Я умею Готовить!");
        System.out.println();
    }

    public void Voice() {
        super.Voice();
        Ability();
    }
}
