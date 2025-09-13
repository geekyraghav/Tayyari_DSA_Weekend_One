package OOPS;
class Point{
    int x;
    int y;
    final int z = 0;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
//    Point(int a, int b){
//        x = a;
//        y = b;
//    }
    void print(){
        System.out.print("("+x+","+y+") ");
        location();
    }
    void location(){
        if(x>0 && y>0) System.out.println("I Quadrant");
        else if(x<0 && y>0) System.out.println("II Quadrant");
        else if(x<0 && y<0) System.out.println("III Quadrant");
        else if(x>0 && y<0) System.out.println("IV Quadrant");
        else if(x==0 && y==0) System.out.println("Origin");
        else if(x==0) System.out.println("X Axis");
        else System.out.println("Y Axis");
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Point p1 = new Point(-3,4);
        // p1.z = 7; // ERROR
        p1.print();

        Point p2 = new Point(2,0);
        p2.print();

        Point p3 = new Point(5,-8);
        p3.print();
    }
}
