class myException extends Exception{
    myException(String msg ){
   super(msg);
    }
   }
   public  class StudentAccount {
   
       double balance ;
        StudentAccount(){
           this.balance=0;
       }
   
   public void deposit (double amount){
       balance += amount;
   }
   public void withdraw (double amount)throws myException {
       if (amount > balance){
           throw new myException("not sufficient fund");
       }
   
   System.out.println(amount +"is withdraw");
   balance -= amount;
   }
   public void getbalance()
   {
       System.err.println("this is balance :"+ balance);
   }
   public static void main(String[] args)
   {
       StudentAccount sa = new StudentAccount();
       try{
           sa.deposit(25000);
           sa.withdraw(20000);
           sa.withdraw(4000);
           sa.withdraw(2000); 
       }
       catch(myException e)
       {
           System.out.println(e.getMessage());
   
       }
   }
   }
