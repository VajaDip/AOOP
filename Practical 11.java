 public class practical11{
         public void area(float radius){
             System.out.println("Area Circle is:- " + ((radius * radius) * 3.14));
         }
         public void area(float legnth , float width ){
             System.out.println("Area Rectangle is:- " + (legnth *width));
         }
         public static void main(String[] args) {
             practical11 x1= new practical11();
             x1.area(4.0f);
             practical11 x2= new practical11();
             x2.area(8.0f , 4.0f);
         }
     }
    
