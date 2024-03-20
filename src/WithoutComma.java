import java.util.Scanner;
public class WithoutComma {


        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.printf("Enter any number with comma: ");
            String inputNumber = Scanner.next();
            int len = inputNumber.length();
            String firstsome = inputNumber.substring(0,len-4);
            String lastThree = inputNumber.substring(len-3);
            System.out.println(firstsome + lastThree);


        }
}
