import java.util.*;
public class vowelOrConsonent {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in) ;
       String vowel="aeiouAEIOU";
       char ch;
       ch=sc.next().charAt(0);
       if(vowel.indexOf(ch)!=-1)
       {
        System.out.println("VOWEL");
       }
       else{
        System.out.println("CONSONENT");
       }
    }
}
