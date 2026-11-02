package tp;
public  class exo8 {
    public static void main(String [] args){
        for(int j = 0; j < 7;j++){
            for(int i = 0; i < 7; i++){
                if (i==3||j==3||i==j||j == 6 - i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            
                
            }
            System.out.println();
        }
    }
}