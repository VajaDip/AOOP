       public class practical9 {

         static int count = 1;
    
         public practical9() {
             count++;
    
         }
    
         static void printMessage() {
             System.out.println("Hello!");
         }
    
         public static void main(String[] args) {
             practical9.printMessage();
             practical9 x1 = new practical9();
             practical9 x2 = new practical9();
             System.out.println(x1.count);
         }
     }
    
