import java.util.*;

public class Abc {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");   // taking name from user
        Scanner sec = new Scanner(System.in);
        String name = sec.next();

        System.out.println("Enter your age : ");
        Scanner abc = new Scanner(System.in);    // taking age from user
        int age = abc.nextInt();

        System.out.println("Enter the place where are you from : ");
        Scanner xyz = new Scanner(System.in);  // taking place from user 
        String place = xyz.next();

        System.out.println("Heres the best intro in short : ");

        System.out.println("Hello everyone ! Myself " + name + " . I am from " + place + " and I am " + age
                + " years old and I'm a Android developer . I wanna make my own business .");
    }
}
