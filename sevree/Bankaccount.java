package sevree;
public class Bankaccount {
    String accountnumber ; 
    double balance ;

	
        void deposite(double amount){
            balance += amount ; 
        }
        void withdraw(double amount){
            if (balance >= amount ) {
                balance -= amount ; 
            }else{
                System.out.println("Insufficient balance! ");
            }
        }
        public Bankaccount (String id , double balance){
            this.accountnumber = id ; 
            this.balance = balance ; 
        }
}
