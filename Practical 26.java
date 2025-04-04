class Eventhread extends tharead 
  {
    public void run(){
      for(int i=2;i<=200,i+=2){
        System.out.println("Even :"+i);
      }
    }
  }
class oddthred extends tharead
 {
    public void run(){
      for(int i=1;i<=100;i+=2){
        System.out.println("odd :"+i);
      }
    }  
 }
public class oddEven thread{
   public static void main(String args[]){
      Eventhared et=new Eventhared();
      oddTharead at=new oddTharead();

     et.start();
     at.start();
   }
}
