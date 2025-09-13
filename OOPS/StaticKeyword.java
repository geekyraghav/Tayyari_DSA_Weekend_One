package OOPS;
class Baccha{
    static String hobby = "Coding";
    String name;
    int rno;
    double cgpa;
    Baccha(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    static void greet(){
        System.out.println("Good Morning");
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Baccha b1 = new Baccha("Prathmesh",23,8.2);
        System.out.println(b1.hobby);

        Baccha b2 = new Baccha("Mangesh",57,6.3);
        b2.hobby = "Cricket";

        System.out.println(b1.hobby);

        b2.greet();
    }
}
