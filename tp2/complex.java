package tp2;
public class complex {
    double real ; 
    double imag ;
    public complex(double real, double imag) {
        this.real = real ; 
        this.imag = imag ; 
    }
    public complex add(complex other) {
        double newreal = this.real + other.real ; 
        double newimag = this.imag + other.imag ; 
        return new complex(newreal, newimag) ;
    }
    public complex conjugate() {
        return new complex(this.real, -this.imag) ; 
    }
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i") ;

    }


}