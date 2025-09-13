package OOPS;
class Animal{
    int legs;
    String type;
    Animal(){ // Default Constructor (1)

    }
    Animal(int l, String t){ // Parameterised Constructor (2)
        legs = l;
        type = t;
    }
    Animal(String t,int l){ // Parameterised Constructor (3)
        legs = l;
        type = t;
    }
    Animal(String x){ // Parameterised Constructor (4)
        type = x;
    }
    Animal(int x){ // Parameterised Constructor (5)
        legs = x;
    }
    void print(){
        System.out.println(type+" "+legs);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Animal a1 = new Animal("Human",2); // 3
        a1.print();

        Animal a2 = new Animal(); // 1
        a2.type = "Tiger";
        a2.legs = 4;
        a2.print();

        Animal a3 = new Animal(8,"Octopus"); // 2
        a3.print();

        Animal a4 = new Animal("Ostrich"); // 4
        a4.legs = 2;

        Animal a5 = new Animal(1);
        a5.type = "Owl"; // 5
    }
}
