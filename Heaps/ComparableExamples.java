package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double cgpa;
    String name;
    Student(int rno, double cgpa, String name){
        this.rno = rno;
        this.name = name;
        this.cgpa = cgpa;
    }
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    public int compareTo(Student s){
        // return Integer.compare(this.rno,s.rno);
        // return Double.compare(this.cgpa,s.cgpa);
        return (this.name).compareTo(s.name);
    }
}
public class ComparableExamples {
    public static void main(String[] args) {
        Student a = new Student(11,8.6,"Aditya");
        Student b = new Student(45,8.5,"Tuhin");
        Student c = new Student(50,7.1,"Arjun");
        Student d = new Student(21,9.8,"Nitish");
        Student[] arr = {a,b,c,d};
        Arrays.sort(arr);
        for(Student s : arr){
            s.print();
        }
    }
}
