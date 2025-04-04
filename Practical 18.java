class car {
    int topSpeed;
    String name;

    public car(int topSpeeda, String namea) {
        topSpeed = topSpeeda;
        name = namea;
    }

    @Override;
    public String toString(){
        return "name is :"+name+"and the totspeed is "+topSpeed; 
    }

    public class Main {
        public static void main(String[] args) {
            car obj = new car(340, "RangeRover");
            car obj2 = new car(240, "Mustang");
            car obj3 = new car(340, "Porsche");
            car obj4 = new car(440, "Lamborghini");
            car obj5 = new car(500, "Grand Vitara");

            System.out.println(obj);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);
            System.out.println(obj5);          
        }
    }
}
