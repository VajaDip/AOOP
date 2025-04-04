class Myclass {
    public void f1(){
        System.out.println("this class Myclass");
    }
}
class Student extends Myclass{
    public void f2(){
        System.out.println("this class Student");
    }
}
class Student2 extends Myclass{
    public void f3(){
        System.out.println("this class Student2");
    }
}

public class practical16{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.f1();
        obj.f2();

        Student2 obj2=new Student2();
        obj2.f1();
        obj2.f3();
    }
}
