//Take an array of Strings input from the user & find the cumulative (combined) // length of all those strings.
import java.util.Scanner;
public class combinedLength{
    public static void main(String[]args){
        System.out.println("Enter the size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        String strings[] = new String[size];
        
        int fullLength = 0 ;
        System.out.println("Enter the strings : " );
        for(int i=0 ; i<size ;i++){
            strings[i] = sc.next();
            fullLength += strings[i].length();
        }
        System.out.println("The total length is : " + fullLength);
        
    }
}
