import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welecome to calculate your CGPA");

        float[] GPA = new float[4];
        int[] credit = new int[4];
        int total_credits=0;
        float CGPA = 0;

        for (int i=0;i < 4 ;i++){
            System.out.print("Enter your semester "+ (i+1) + " GPA : ");
            GPA[i] = scanner.nextFloat();
            System.out.print("Enter your semester "+ (i+1) + " credits : ");
            credit[i] = scanner.nextInt();
            total_credits+=credit[i];
        }

        // CGPA calculation 
        // CGPA = sum(GPA[i]*credit[i]) /(sum of credits)
        for (int i=0;i<4;i++){
            CGPA += credit[i]*GPA[i] ;
        }
        CGPA=CGPA/total_credits;

        System.out.println("Your CGPA is : "+ CGPA);

    }
}
