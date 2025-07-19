package BasicsOfJava;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        int ascii = ch; // implicit typecasting
        System.out.println(ascii);

        char x = '0';
        int asc = (int)x; // explicit typecasting
        System.out.println(asc);

        char ch2 = 'b';
        // System.out.println((int)ch2);
        System.out.println(ch2+0); // char + int gives int

        System.out.println(ch+ch2); // char + char gives int

        System.out.println(1+'1');
    }
}
