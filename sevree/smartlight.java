package sevree;
public class smartlight{
    String roomname ; 
    double brightness ;
    boolean ison ;
    public smartlight (String roomname , double brightness , boolean ison ) {
        this.roomname = roomname ; 
        this.brightness = brightness ; 
        this.ison = ison ; 
    }
    void turnon () {
        this.ison = true ; 
    }
    void turnoff () {
        this.ison = false ; 
    }
    void dim(int value) {
        if(value >= brightness) {

        }else {
            this.brightness -= value ; 

        }
    }
    void printstatus() {
        System.out.println("roomname : " + this.roomname);
        System.out.println("brightness : " + this.brightness);
        System.out.println("ison : " + this.ison);
    }
}