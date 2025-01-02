import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num1,num2 ;
        float result;
        char operation ;

        System.out.println("Welcome to my calculator");

        System.out.print("Enter first number : ") ;
        num1 = obj.nextInt();

        System.out.print("Enter first number : ") ;
        num2 = obj.nextInt();

        System.out.print("Enter the operation : ");
        operation = obj.next().charAt(0);

        obj.close();

        switch (operation) {
            case '+' :
                result = num1 + num2 ;
                break;
            case '-' :
                result = num1 - num2 ;
                break;
            case '*' :
                result = num1 * num2 ;
                break;
            case '/' :
                result = num1 / num2 ;
                break;
            default :
                System.out.println("Invalid operation ");
                return;
        }
        System.out.println("The expression " +num1 + " " + operation + " " + num2 +" = "+ result );
        
    }
}
