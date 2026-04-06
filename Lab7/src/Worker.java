public class Worker {
    public String Name;

    public Worker(String Name){
        this.Name=Name;
    }

    public void Voice() {
        System.out.print("Меня зовут " + Name + "." + " ");
    }
}
