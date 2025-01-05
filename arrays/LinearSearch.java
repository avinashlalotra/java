import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 2,4,3,2,1,5,6,7,4,3,3,2,6 } ;
        Scanner scanner = new Scanner(System.in);
        int search;
        System.out.print("Enter number to search : ");
        search = scanner.nextInt() ;

        for (int i=0;i<numbers.length ; i++){
            if ( numbers[i] == search){
                System.out.println("Found number "+search+" at index "+i);
                return;
            }
        }
        System.out.println(" Not Found number "+search);
                


    }
}
