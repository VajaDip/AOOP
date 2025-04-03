
 public class practical13{
     public static void main(String[] args) {
         String str = "Hello India";

         char ch1 = str.charAt(8);
         System.out.println(ch1);

         boolean ch2 = str.contains("Hyyy");
         System.out.println(ch2);

        
         String ch3 = str.format("Hello %s" , "India");
         System.out.println(ch3);

         int ch4 = str.length();
         System.out.println(ch4);

         String[] ch5 = str.split(" ");
         for(String word:ch5){
             System.out.println(word);
         }
    }
 }
