import java.util.*;
public class Once_again_combined_length {
    public static void main(String[] args) {
        System.out.println("How many strings do you want to enter : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String myArray[] = new String[size];
        int  full_length = 0;

        System.out.println("Enter the strings : ");
        for(int i=0;i<size;i++){
            myArray[i] = sc.next();
            full_length += myArray[i].length();
        }
        System.out.println("The combined length is : "+full_length);
    }
}
