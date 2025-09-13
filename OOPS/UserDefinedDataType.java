package OOPS;

public class UserDefinedDataType {
    public static void main(String[] args) {
        // s1 and s2 are objects
        Student s1 = new Student();
        s1.name = "Vishu";
        s1.rno = 112;
        s1.cgpa = 8.4;

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        s1.cgpa = 9.1;
        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);

        Student s2 = new Student();
        s2.name = "Nitish";
        s2.rno = 35;
        s2.cgpa = 7.6;

        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);

        Student s3 = s2; // s3 is shallow copy of s2
        s3.name = "Mayank";
        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);
    }
}
