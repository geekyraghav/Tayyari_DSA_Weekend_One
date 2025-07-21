package Loops;

public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i>0){ // This will run forever
            System.out.println(i);
            i++;
        }

        while('a'<'b'){ // This will run forever
            System.out.println("Nikhil");
        }
    }
}
