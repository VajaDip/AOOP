 public class practical6{
     public int ernum;
     public String name;
     public practical6(String name , int ernum){
         this.ernum = ernum;
         this.name = name;
     }
     public static void main(String[] args) {
         practical6 p1 = new practical6("Axit", 22);
         practical6 p2 = new practical6("Savan", 65);
         practical6 p3 = new practical6("Vivek", 72);
         System.out.println(p1.name);
         System.out.println(p2.name);
         System.out.println(p3.name);
     }
 }
