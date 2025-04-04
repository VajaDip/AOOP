 class practical14{
     public void Eating() {
         System.out.println("Drinking ...");
     }
 }
 class cat extends practical14 {
     public void practical14name() {
         System.out.println("Milk...");
     }
 }

 public class Main{
         public static void main(String[] args) {
           cat x1=new cat();
             x1.Eating();
             x1.practical14name();
         }
     }
