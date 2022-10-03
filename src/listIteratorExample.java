import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
//class StudentList{
//    String name;
//    int rollNumber;
//    double marks;
//
//    StudentList(String name,int rollNumber,double marks){
//        this.name=name;
//        this.rollNumber=rollNumber;
//        this.marks=marks;
//    }
//
//    public String getDetails(){
//        return "Name : "+this.name+",Roll Number : "+this.rollNumber+",marks: "+this.marks;
//    }
//}

public class listIteratorExample {
//    public static void iterateOnList(ArrayList<StudentList> students){
//        //forward
//        ListIterator<StudentList> sit = students.listIterator();
//        System.out.println("Printing Student List using iterator in forward directtion");
//
//        while(sit.hasNext()){
//            System.out.println(sit.next().getDetails());
//        }
//        //backward direction
//        System.out.println("Printing Student List using iterator in backard direction");
//
//        while(sit.hasPrevious()){
//            System.out.println(sit.previous().getDetails());
//        }
//
////        sit = students.listIterator(students.size());
//        ListIterator<StudentList> bit = students.listIterator(students.size());
//        System.out.println("Printing Student List using iterator in backard direction and re-initialization of iterator");
//
//        while(bit.hasPrevious()){
//            System.out.println(bit.previous().getDetails());
//        }
//    }

    public static long listPerformance(List<Integer> list){
        long starttime = System.nanoTime();
        //add element at location 0
//        for(int i=100000;i<100100;i++){
//            list.add(0,i);
//        }

        //read elements from location o to n-1
        for(int i=0;i< list.size();i++){
            list.get(list.size()/2);
        }
        return System.nanoTime()-starttime;
    }

    public static void main(String[] args) {
//        ArrayList<StudentList> student = new ArrayList<StudentList>();
//        StudentList s1 = new StudentList("A",1,80);
//        StudentList s2 = new StudentList("B",2,81);
//        StudentList s3 = new StudentList("C",3,79);
//
//        student.add(s1);
//        student.add(s2);
//        student.add(s3);
//
//        iterateOnList(student);


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Adding elements in ArrayList. Time Required to add 100000 Elements is : ");
        long starttime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        long endtime = System.nanoTime();
        System.out.println(endtime-starttime);

        System.out.println("Adding elements in LinkedList. Time Required to add 100000 Elements is : ");
        starttime = System.nanoTime();
        for(int i=0;i<100000;i++){
            linkedList.add(i);
        }
        endtime = System.nanoTime();
        System.out.println(endtime-starttime);

//        System.out.println("Add elements at location 0");
//        System.out.println("For ArrayList time consumed is :" + listPerformance(arrayList) );
//        System.out.println("Add elements at location 0");
//        System.out.println("For LinkedList time consumed is :" + listPerformance(linkedList) );

        System.out.println("To read elements, For ArrayList time consumed is :" + listPerformance(arrayList) );
        System.out.println("To read elements, For LinkedList time consumed is :" + listPerformance(linkedList) );


    }
}

