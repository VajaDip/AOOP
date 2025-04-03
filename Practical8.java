
public class practical8{
    double height;
    double weight;
    public practical8(double height , double weight){
        this.height = height;
        this.weight = weight;
    }
    public static void main(String[] args) {
        practical8 x1 = new practical8(43.67 , 76.99);
        System.out.println(x1.height);
        System.out.println(x1.weight);
    }
}
