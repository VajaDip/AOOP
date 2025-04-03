public class practical3{
    public static void main(String[] args) {
         int number = 321;
         int p = 0;
         while(number != 0){
             int digit = number % 10;
             p= p*10+digit;
             number /= 10;
         }
         System.out.println(p);
     }
 }
