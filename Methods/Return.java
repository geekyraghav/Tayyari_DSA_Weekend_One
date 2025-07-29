package Methods;

public class Return {
    public static void main(String[] args) {
        System.out.println(raftar(25));
    }
    public static int raftar(int x){
        System.out.println("Badshaah");
        if(x<15) return x;
        System.out.println("Gian");
        return x*x;
    }
}
