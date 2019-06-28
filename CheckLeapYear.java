import java.util.Scanner;
public class CheckLeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        boolean isLeap = false;

        if(year % 4 == 0){
                isLeap = true;
            
        }else{
            isLeap = false;
        }

        if(isLeap == true){
            System.out.println(year + " is a Leap year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}