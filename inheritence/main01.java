package inheritence;

public class main01 {
    public static void main(String[] args){
        // Demonstrating method polymorphism (overloading static)
        overloading calc = new overloading();

        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(5.5, 4.5));
        // Demonstrating inheritance 
        // method  polymorphism (overriding dynamic)
        Animal myAnimal = new Animal("Generic Animal");
        dog myDog = new dog("Buddy", "Golden Retriever");
        myAnimal.eat();
        myDog.eat();
       
    }
    }