package OOPS;
class Mobile{
    String name;
    int price;
    int megapixel;
    double screenSize;
    int battery;
    void print(){
        System.out.println(name+" "+price+" "+megapixel+" "+battery+" "+screenSize);
    }
}
public class MethodsInsideClass {
    public static void printDetails(Mobile m){
        System.out.println(m.name+" "+m.price+" "+m.megapixel+" "+m.battery+" "+m.screenSize);
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.battery = 2900;
        m1.name = "iPhone 15";
        m1.megapixel = 48;
        m1.price = 53000;
        m1.screenSize = 6.1;
        m1.print();
        // printDetails(m1);

        Mobile m2 = new Mobile();
        m2.battery = 5000;
        m2.name = "Galaxy S21 FE";
        m2.megapixel = 12;
        m2.price = 33000;
        m2.screenSize = 6.3;
        m2.print();

        Student s = new Student();
    }
}
