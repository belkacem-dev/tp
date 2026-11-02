package sevree;
public class robot {
    String name ;
    int batterylvl ;
    public robot (String name , int batterylvl ) {
        this.name = name ; 
        this.batterylvl = batterylvl ; 
    }
    public void charge (){
        batterylvl += 20 ;
    }
    public void transferpower(robot target ,int amount ) {
        if(batterylvl - amount < 0 ) {
            System.out.println("not enough battery to transfer");
        }else {
            this.batterylvl -= amount ; 
            target.batterylvl += amount ;
        }
    }
}
