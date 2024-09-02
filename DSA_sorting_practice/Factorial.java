import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to check it's factorial : "); // making object 
        Scanner input = new Scanner(System.in);                             // user input
        int num = input.nextInt();

        int i = 1;
        int fact= 1; 
        for(i=1;i<=num;i++){                      //using for loop
            fact *= i;
        }
        System.out.println(fact);            //Printing factorial
    }
}
