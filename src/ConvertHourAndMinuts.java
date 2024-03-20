import java.util.Scanner;
public class ConvertHourAndMinuts { ;
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int firstTime, secondTime, difference;
            String hour, minute;
            System.out.print("Please enter the first time: ");
            firstTime = in.nextInt();
            System.out.print("Please enter the second time: ");
            secondTime = in.nextInt();
            in.close();
            difference = secondTime - firstTime;
            minute = String.valueOf(difference);
            minute = minute.substring(minute.length() - 2, minute.length());

            hour = String.valueOf(difference);
            hour = hour.substring(0,hour.length() - 2);

            System.out.println(hour + " hours " + minute + " minutes");
        }
    }







