package Methods;

public class MultipleMethods {
    public static void arjun(){
        System.out.println("Vaibhav");
        pasha();
    }
    public static void main(String[] args) {
        arjun();
        pasha();
        vishesh();
    }
    public static void vishesh(){
        arjun();
        System.out.println("Eva");
    }
    public static void pasha(){
        System.out.println("Parveen");
    }
}
