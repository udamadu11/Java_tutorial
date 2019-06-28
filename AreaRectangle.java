import java.util.Scanner;
public class AreaRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hieght : ");
        int height = sc.nextInt();
        System.out.print("Enter Width : ");
        int width = sc.nextInt();
        int area = height * width;
        System.out.println("Area of Rectangle : " + area);
    }
}