import java.util.Scanner;
public class CheckVovelOrCons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch = sc.next().charAt(0);
        boolean isVovel = false;
        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVovel = true ;

        }        
        if(isVovel == true){
            System.out.println(ch + " is a vovel ");
        }else{
            if((ch >='a' && ch <='z' )||( ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " Is a Consonant");
            else{
                System.out.println(ch + " Is not a Consonant");
            }
        }
        
    }
}