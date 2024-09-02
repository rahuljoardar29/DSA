import java.util.*;
public class Practice_1 {  //Take an array of strings and find the combined length
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        System.out.println("How many strings do you want to enter :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 

        String sentence[] = new String[size];
        int totlength = 0;
        System.out.println("Enter the strings : ");
        for(int i=0 ; i<size ; i++){
            sentence[i] = sc.next();
            totlength += sentence[i].length();
        }
        System.out.println("The total length is" + totlength);
    }
}
