package inheritence;
public class Animal{
    String name;
    public  Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.print(name + " is eating.");
    }
}