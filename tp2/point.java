package tp2;
import java.lang.Math;
public class point {
    String name;
    int x;
    int y;
    public point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public void distance(point other) {
        int dx = (this.x - other.x);
        dx = dx*dx ; 
        int dy = this.y - other.y;
        dy = dy*dy ;
        double distence = (double) Math.sqrt(dx+dy) ;
        System.out.println("Distance between " + this.name + " and " + other.name + ": " + distence);
    }
}
