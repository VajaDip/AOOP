class practical15{
    public void x1()
    {
        System.out.println("this is practical15 class");
    }
}
class Myclass extends practical15{
    public void x2()
    {
        System.out.println("this is Myclass class");
    }
}
class Student extends Myclass{
    public void x3()
    {
        System.out.println("this is Student class");
    }
}
public class StudentAccount {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.x1();
        obj.x2();
        obj.x3();
    }

}
