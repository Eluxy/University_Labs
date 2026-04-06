public class Dog implements Animal{
    public void bark() {
        System.out.println("Собака лает!");
    }

    public void speak() {
        bark();
    }
}
