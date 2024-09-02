import java.util.*;
public class Practice_2 {
    public static void main(String[] args) {
        System.out.println("Enter the email : ");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String username = "";

        for(int i=0 ; i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i);
            }
           
        }
        System.out.println("Your username is :"+username);

        
    }
}
