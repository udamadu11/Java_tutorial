import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            System.out.print(i + " = " );
            arr[i] = sc.nextInt();
        }
        for(int i = n-1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}