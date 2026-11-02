package inheritence;
public class dog extends Animal {
    private String breed;

    public dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " the " + breed + " is eating.");
        return name ;
    }
}