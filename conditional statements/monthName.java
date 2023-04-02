import java.util.*;
public class monthName {
    public static void main(String[] args) {
        String[] mName={"January","Febraury","March","April","May","June","July","August","September"
    ,"October","November","December"};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number between 1-12");
    int num=sc.nextInt();
    System.out.println(mName[num-1]);
    }
}
