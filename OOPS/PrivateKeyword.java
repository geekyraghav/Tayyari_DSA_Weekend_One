package OOPS;
class Student{ // user defined data type
    private String teacher = "Raghav";
    String name;
    int rno;
    double cgpa;
    String getTeacher(){ // getter
        return teacher;
    }
    void setTeacher(String s){ // setter
        teacher = s;
    }
    void print(){ // getter
        System.out.println(teacher+" "+name+" "+rno+" "+cgpa);
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.teacher = "xyz"; ERROR
        s1.name = "Aditya";
        s1.rno = 62855;
        s1.cgpa = 7.8;
        s1.setTeacher("Sandeep Sir");
        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa+" "+s1.getTeacher());
    }

}
