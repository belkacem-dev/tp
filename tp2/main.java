package tp2;
public class main {

    public static void main(String[] args) {
        //point
        point p1 = new point("A", 2, 3);
        point p2 = new point("B", 5, 7);
        p1.distance(p2);
        //complex
        complex c1 = new complex(2, 3);
        complex c2 = new complex(5, 7);
        c1.add(c2);
        c1.display();
        //date
        date d1 = new date(1, 1, 2020);
        date d2 = new date(4, 5, 2020);
        System.out.println(d1.daysbt(d2));
    }
}