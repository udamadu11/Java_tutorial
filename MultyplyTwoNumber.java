import java.util.Scanner;
public class MultyplyTwoNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second Number : ");
        int num2 = sc.nextInt();

        int num3 = num1 * num2 ;

        System.out.println(num3);

    }
}