package OOPS;
class Car{
    String name;
    String color;
    int seats;
    int power;
}
public class PassingObjectsToMethods {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Black";
        c1.name = "Kia Sonet";
        c1.power = 118;
        c1.seats = 5;
        change(c1);
        System.out.println(c1.color);
    }

    public static void change(Car x) { // x is shallow copy of c1
        x.color = "Blue";
    }
}
