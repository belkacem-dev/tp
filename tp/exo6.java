package tp;
public class exo6{
    public static void main (String [] args){
        int sum = 0;
        if (args.length == 0){
            System.out.println("there is no argument");
        } else {
          int n = args.length;
          int t [ ] =new int [n];
          //1
          for (int i=0; i<n; i++){
              t[i] = Integer.parseInt(args[i]);
              sum += t[i];
          }
          //2
          double average = (double)sum/n;
          //3
          int max = t[0];
          for(int i = 0 ; i <n ; i++){
              if(t[i] > max){

                  max = t[i];
              }
          }
          int index ;
          for(int i = 0 ; i <n ; i++){
              if(t[i] == max){
                  index = i;
              }
          }
          int above = 0;
          for(int i = 0 ; i <n ; i++){
              if(t[i] > average){
                  above++;
              }
          }
        }
    }
}