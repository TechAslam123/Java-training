public class NestedIf{
    public static void main(String[] args){
        int a = 60;  
        boolean hasticket =true;
        if(hasticket==true){
            if(a>=60){
                 System.out.println("eligble for test");
            }
        
        else{
            System.out.println("pay fine then go for test");
        }
    }
        else{
            System.out.println("noteligible for test");
        }
    }
}