import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        String password = "password";
        Scanner myscanner = new Scanner(System.in);
        String guess ;
        System.out.println("Welcome to the game. guess the correct password");
        while (true){
            System.out.print("enter the password : ");
            guess = myscanner.next() ;
            if (guess.equals(password)){
                System.out.println("hurray you won the game . You can leave");
                break ;
            }
            else{
                System.out.println("Wrong guess "+guess+ " . You are stuck . Try again");
            }
        }
        myscanner.close();

    }
}
