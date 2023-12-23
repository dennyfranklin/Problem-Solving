package Mapping;

public class Student {
    String name;
    int rollNo;
    int age;
    public Student(){

    }
    public void Details(String name, int rollNo ,int age ){
        this.name = name ;
        this.rollNo = rollNo;
        this.age = age;
    }
    public static void main(String[] args){
           Student stu = new Student();
       // stu.Details();
           stu.Details("Denny",2,18);
    }
}