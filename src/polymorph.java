//import java.rmi.StubNotFoundException;
//
////abstract class, interface and exception handling
//
//abstract class Person{
//    String name;
//    Person(String name){
//        this.name =name;
//    }
//     public abstract void getDetails();
//}
//abstract class vendor extends Person{
//    vendor(String name){
//        super(name);
//    }
//}
//
////class Person{
////    String name;
////    Person(String name){
////        this.name =name;
////    }
////    public void getDetails(){
////        System.out.println("Default getdetails method body from Person class");
////    };
////}
//
//class Professor extends Person{
//    int employeeId;
//    Professor(String name, int employeeId){
//        super(name);
//        this.employeeId =employeeId;
//    }
//    public void getDetails(){
//        System.out.println("Name : " + this.name + "Employee ID: " +this.employeeId );
//    }
//}
//class student extends Person{
//    public int year;
//    private static final int fee = 50000;
//
//    student(String name, int year){
//        super(name);
//        this.year = year;
//    }
//    public int calculateFees(){
//        return this.year * fee;
//    }
//    public int calculateFees(int annualFee){
//        return this.year*annualFee;
//    }
////    error
////    public double calculateFees(int annualFee){
////        return (double) this.year*annualFee;
////    }
//
//    public void getDetails(){
//        System.out.println("Name : " + this.name + " , Year : " + this.year + " , Fee : " + calculateFees());
//    }
//
//}
//
//class ResearchStudent extends student {
//    String researchArea;
//    private static final int fee = 60000;
//    public int calculateFees(){
//        return this.year * fee;
//    }
//    ResearchStudent(String name, int year, String researchArea){
//        super(name,year);
//        this.researchArea = researchArea;
//    }
//    public void getDetails(){
//        super.getDetails();
//        System.out.println("Research Area : " + this.researchArea);
//    }
//}
//
//
//class phDStudent extends ResearchStudent {
//    String thesisTitle;
//    private static final int fee = 30000;
//    public int calculateFees(){
//        return this.year * fee;
//    }
//    phDStudent(String name, int year, String researchArea,String thesisTitle){
//        super(name,year,researchArea);
//        this.thesisTitle = thesisTitle;
//    }
//    public void getDetails(){
//        super.getDetails();
//        System.out.println("Thesis title : " + this.thesisTitle);
//    }
//}
//
//public class polymorph {
//    static public void printDetails(student []stud){
//        for(student s:stud){
//            s.getDetails();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        phDStudent p1 = new phDStudent("kritika",2,"Network Security","Use of blockchain in securing HTTPS connections" );
////        p1.getDetails();
//        ResearchStudent r1 = new ResearchStudent("Anuj",1,"Data Analytics");
////        r1.getDetails();
//        student s1 = new student("Manshoo", 1);
////        s1.getDetails();
////        s1 = new ResearchStudent("Kumari",2,"Big Data");
////        s1.getDetails();
//        student s3 = new ResearchStudent("Kumari",2,"Big Data");
////        s3.getDetails();
//        // following line is error
////        r1 = new student("akshansh", 2);
//        student []std={p1,r1,s1,s3};
//        printDetails(std);
////        Person pr1 =new Person("Dummy");
////        pr1.getDetails();
//        Person pr1 = new student("ABC",3);
//        pr1.getDetails();
//        Professor prf = new Professor("Suraj",202201);
//        prf.getDetails();
//    }
//}
//
//
//
////abstract class shape{
////    public int perimeter;
////    public abstract double area();
////}
////
////class circle extends shape{
////    public double area(){
////        return pi*r*r;
////    }
////}
//
//
//
////interface - complete abstract class , without any instance variable
//abstract class shapeClass{
//    public abstract void perimeter();
//    public abstract double area();
//}
//
//
//
