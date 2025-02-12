import java.util.Scanner;
public class digit {
    public static void main(String[] args){
        System.out.println("enter the number:");
        Scanner scan = new Scanner(System.in);
           int n= scan.nextInt();
         int count=0;
       while(n!=0)
       {
        int rem = n%10;
           count++;
        n=n/10;

       }
       System.out.println(count);
    }
}
