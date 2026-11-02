import java.util.Scanner;


public class day01{
    public static void main(String [] args) {

          
           Scanner scanner = new Scanner (System.in);
           
           System.out.print("ENTER YOUR name pls :");
           String name = scanner.nextLine();
           System.out.print("enter your age pls :");
           int age = scanner.nextInt() ;
           System.out.print("how much you wight ?");
           double weight = scanner.nextDouble();
           System.out.println("are you a student ? (true or false)");
           boolean student = scanner.nextBoolean();
           System.out.println("hello " + name);
           System.out.println("hello " + name + " your age is " + age);
           System.out.println(" and your weight is " + weight);
           if (student == true) {
            System.out.println("you are a student");
        } else {
            System.out.println("you are not a student");
    }
    scanner.close ();
    
    
        short num1 = 10;
        short num2 = 20;
        int sum = num1 + num2;
        System.out.println("the sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.print("ENTER YOUR age pls :");
        int age0 = scanner.nextInt();
        System.out.print("what is you favorite color ? ");
        String color = scanner.next();
        System.out.println("your age is : " + age0);
        System.out.println("your favorite color is : " + color);
       
        double lenght = 0;
        double width = 0;
        double area = 0;
        System.out.print("ENTER THE LENGHT OF RECTANGLE :");
        lenght = scanner.nextDouble();
        System.out.print("ENTER THE WIDTH OF RECTANGLE :");
        width = scanner.nextDouble();
        area = lenght * width;
        System.out.println("THE AREA OF RECTANGLE IS : " + area);
        




        scanner.close();

    }
}