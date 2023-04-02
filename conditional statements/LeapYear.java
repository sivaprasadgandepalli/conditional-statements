import java.util.*;
public class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%400==0 || n%4==0) System.out.println("Leap Year");
        else if(n%100==0) System.out.println("Not a Leap Year");
        else System.out.println("Not a Leap Year");

    }
}