import java.util.Scanner;
public class CalculateArrayAvg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int total = 0;

        for(int i = 0; i < n ;i++ ){
            System.out.print("Enter the Array " + i + " = ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n; i++){
            total = total+ arr[i];
        }
        System.out.println("Total is " + total);
        float avg = (float)(total / n);
        System.out.println("Avarage is  " + avg);

    }
}