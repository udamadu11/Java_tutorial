import java.util.Scanner;
public class CharToString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch = sc.next().charAt(0);
        String stri = Character.toString(ch);
        System.out.println(stri);
    }
}