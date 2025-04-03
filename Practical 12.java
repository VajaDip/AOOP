
 public class practical12{
    practical12(float radius){
         System.out.println("Area Circle is:- " + ((radius * radius) * 3.14));
     }
     practical12(float legnth , float width ){
         System.out.println("Area Rectangle is:- " + (legnth *width));
     }
     public static void main(String[] args) {
         practical12 x1= new practical12(4.0f);
         practical12 x2= new practical12(8.0f , 4.0f);
     }
 }
