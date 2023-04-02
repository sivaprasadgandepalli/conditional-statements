import java.util.*;
public class question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=0;i<(n/2)-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
