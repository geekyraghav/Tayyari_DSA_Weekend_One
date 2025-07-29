package Methods;

public class LocalVariables {
    public static void main(String[] args) {
        int a = 10; // a is local to main
        fun();
//        System.out.println(b); ERROR
//        for(int i=1;i<=5;i++){
//            System.out.print(i+" ");
//        }
//        System.out.print(i+" ");
    }
    public static void fun(){
//        System.out.println(a); ERROR
        int b = 7;
    }
}
