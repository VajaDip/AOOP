class Thread1 extends Thread{
  public void run(){
    try{
      while(true){
        sleep(1000);
        System.out.println("Thread1");
      }
    }
    catch(interrupted Exception e){}
  }
}
class Thread2 extends Thread{
  public void run(){
    try{
      while(true){
        sleep(2000);
        System.out.println("Thread2")
      }
    }
    catch(Interrupted Excaption e){}
  }
}
class Main{
  public static void Main(String[] args){
    Thread1 t1=new Thread1();
    Thread1 t2=new Thread2();

    t1.start();
    t2.start();
    
  }
}
