import java.util.Scanner;
public class hello{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the value of a");
      int a = scan.nextInt();
      System.out.println("enter the value of b");

      int b = scan.nextInt();
       if(a>b){
         System.out.println("a is greater than b");
       }
       else{
         System.out.println("b is greater than a");

       }
   }
}