import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
public String name;
public int rollNumber;
public double perc;
Student(String name,int rollNumber,double perc){
    this.name=name;
    this.rollNumber = rollNumber;
    this.perc = perc;
}
public String getDetails(){
    return "Name :" + this.name + "\t Roll Number : " + this.rollNumber + "\t Percentage : " + this.perc;
}
}

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Nikita",1,89.93));
//        students.add(new Student("Kartikey",2,90.12));
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter new student name : ");
//        String name = sc.next();
//        students.add(new Student(name,3,85.55));
//        printStudentList(students);


        LinkedList<Student> lList =new LinkedList<>();
        lList.add(new Student("Nikita",4,94));
        System.out.println("Enter name, roll Number and percentage for 5 students");
        Student s1 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s2 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s3 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s4 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        Student s5 = new Student(sc.next(),sc.nextInt(),sc.nextDouble());

        lList.add(s1);
        lList.add(s2);
        lList.add(s3);
        lList.add(s4);
        lList.add(s5);
        printStudentLList(lList);

//        students.get(0);
        System.out.println(lList.get(0).name);
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(2);
        System.out.println(intList.get(0));
        sc.close();
    }
    static void printStudentList(ArrayList<Student> students){
        System.out.println("Printing Student list from ArrayList : ");
        for(Student ob: students){
            System.out.println(ob.getDetails());
        }
    }

    static void printStudentLList(LinkedList<Student> students){
        System.out.println("Printing Student list from LinkedList : ");
        for(Student ob: students){
            System.out.println(ob.getDetails());
        }
    }
}
