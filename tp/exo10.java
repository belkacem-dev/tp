package tp;
public class exo10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            String secondNum = "";
            for (int j = 0; j < i; j++) {
                secondNum = secondNum + (9 - j);
            }

            int addedValue = 8 - i;

            String result = "";
            for (int j = 0; j <= i; j++) {
                result = result + "8";
            }

            System.out.println("9 x " + secondNum + " + " + addedValue + " = " + result);
        }
    }
}