import java.util.Scanner;
public class PrintArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt(); 

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.print(i + " = " );
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println("Array " + i + " = " + arr[i]);
        }
    }
}