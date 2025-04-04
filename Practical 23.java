class MyException extends Exception { 
    String detail;

    MyException(String s) {
        detail = s;
    }

    @Override
    public String toString() {
        return detail;
    }
}

public class p23 { 
    public static void main(String[] args) {
        try {
            throw new MyException("Division by zero"); 
        } catch (MyException e) { 
            System.out.println("Caught: " + e); 
        }
    }
}        
