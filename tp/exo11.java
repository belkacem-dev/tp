package tp;
import java.util.Scanner;
public class exo11 {
    public static void main(String[] args) {
        Scanner harmonic = new Scanner(System.in);
        System.out.print("enter n =  ");
        int n = harmonic.nextInt();
        harmonic.close();
        double sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i); }
            System.out.println("the sum of the harmonic series  = " + n + " is: " + sum);
        }
}