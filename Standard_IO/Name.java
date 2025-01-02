import java.util.Scanner;

public class Name {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in) ;
        System.out.print("What is Your name ? ");

        String name = scanner.nextLine();
        System.out.println(" Hi "+name+" how was your day ?" );
        
        scanner.close() ;
    }
}
