package tp;
public class exo7 {
    public static void main(String [] args){
        for(int j = 0; j < 7;j++){
            for(int i = 0; i < 7; i++){
                if (i==3||j==3||i==j||j == 6 - i){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            
                
            }
            System.out.println();
        }
    }
}
