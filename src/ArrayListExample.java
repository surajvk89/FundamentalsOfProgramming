import java.util.ArrayList;
import java.util.LinkedList;

class Student{
public String name;
//public int rollnumber;
Student(String name){
    this.name=name;
}
public String getDetails(){
    return this.name;
}
}

public class ArrayListExample {
    public static void main(String[] args) {

        String []studentList = {"Anuj", "Akshansh", "Raghav"};
//        studentList[index] = newElement;
        printStudent(studentList);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nikita"));
        students.add(new Student("Kartikey"));
//        name = sc.next();
//        rollnumber = sc.nextInt();
//        students.add(new Student(name, rollnumber));
        printStudentList(students);


        LinkedList<Student> llist =new LinkedList<Student>();
        llist.add(new Student("Nikita"));

//        students.get(0);
        llist.get(0);
        System.out.println(llist.get(0).name);
        LinkedList<Integer> intlist = new LinkedList<>();
    }

    static void printStudent(String []studentList){
        for(String s:studentList){
            System.out.println(s);
        }
    }
    static void printStudentList(ArrayList students){
        for(Object ob: students){
            Student s = (Student) ob;
            System.out.println(s.getDetails());
        }
    }
}
