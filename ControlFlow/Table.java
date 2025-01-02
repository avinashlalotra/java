import java.util.Scanner;
public class Table {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to print table of numbers") ;
        System.out.print("Enter the number : ") ;
        int number = scanner.nextInt() ;
        for (int i=1; i<=10 ; i++){
            System.out.println(number + " * " + i + " = " + number*i );
        }
        scanner.close();
    }
}
