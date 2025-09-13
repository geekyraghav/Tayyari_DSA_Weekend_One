package OOPS;
class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print() {
        System.out.println(num+"/"+den);
    }

    void simplify(){
        // divide num and den by their HCF
        int hcf = gcd(num,den);
        num /= hcf;
        den /= hcf;
    }

    private int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }

    void add(Fraction f) {
        this.num = this.num*f.den + this.den*f.num;
        this.den = this.den*f.den;
        simplify();
    }
    void multiply(Fraction f) {
        num *= f.num;
        den *= f.den;
        simplify();
    }
    void subtract(Fraction f) { // HOMEWORK

    }
    void divide(Fraction f) { // HOMEWORK

    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(6,8);
        f1.print();
        Fraction f2 = new Fraction(5,6);
        f2.print();

        f1.add(f2);
        // f1.multiply(f2);
        f1.print();
    }
}
