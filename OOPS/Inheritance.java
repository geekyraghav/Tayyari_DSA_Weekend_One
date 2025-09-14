package OOPS;
class Animals{
    String color;
    int weight;
    String name;
}
class Bird extends Animals{
    int altitude;
}
class AquaticAnimal extends Animals{
    int fins;
}
class Fish extends AquaticAnimal{
    int gills;
    int scales;
}
public class Inheritance {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.color = "White";
        b1.name = "Dove";
        b1.altitude = 300;

        Fish f = new Fish();


        AquaticAnimal aq1 = new AquaticAnimal();

    }
}
