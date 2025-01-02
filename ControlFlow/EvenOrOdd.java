import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){

        System.out.println("Is your roll number even or odd ? let's find out.");
        System.out.print("Enter Your roll number : ");
        Scanner scanner = new Scanner(System.in) ;
        int number = scanner.nextInt();
        scanner.close();
        
        if ( number % 2 == 0){
            System.out.println("hey your roll number is even ");

        }
        else {
            System.out.println("Your roll number is Odd");
        }
    }
}
