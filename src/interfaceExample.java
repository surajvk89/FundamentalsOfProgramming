//interface Person{
//public abstract String getDetails();
//public abstract float computeSalary();
//
//default void defaultMethod(){
//    System.out.println("This is default method");
//}
//}
//
//class Professor implements Person{
//    protected int employeeId;
//    private static final int startSalary = 50000;
//    Professor(int employeeId){
//        this.employeeId = employeeId;
//    }
//    public float computeSalary(){
//        return startSalary * 12;
//    }
//    public String getDetails(){
//        return "Employee ID : " + this.employeeId + ", Annual Salary is: " + computeSalary();
//    }
//
//}
//
//class Student implements Person{
//    protected final int rollNumber;
//    protected int year;
//    protected static final int annualFee = 10000;
//    protected static final int annualSalary = 15000;
//    Student(int rollNumber,int year){
//        this.rollNumber = rollNumber;
//        this.year = year;
//    }
//    public float computeSalary(){
//        return Student.annualSalary * this.year;
//    }
//    public String getDetails(){
//        return "Student Roll Number : "+this.rollNumber+",Scholarship amount:Rs."+computeSalary();
//    }
//}
//
//
//
//
//public class interfaceExample {
//    public static void main(String[] args) {
//        Professor prf1= new Professor(202201);
//        Professor prf2= new Professor(202202);
//        Professor prf3= new Professor(202203);
//        Student st1 = new Student(20222001,1);
//        Student st2 = new Student(20222002,1);
//        Student st3 = new Student(20222003,1);
//        Person []per = {prf1,prf2,prf3,st1,st2,st3};
//        printDetails(per);
//        Person p=new Student(2122,222);
//        p.defaultMethod();
//    }
//
//
//    public static void printDetails(Person []person){
//        for(Person pr:person){
//            System.out.println(pr.getDetails());
//        }
//
//    }
//}
//
////
////abstract class anonymous_class{
////    abstract void printName();
////}
////public class interfaceExample {
////    public static void main(String[] args) {
////        anonymous_class anmObj = new anonymous_class() {
////            @Override
////            void printName() {
////                System.out.println("Anonymous class ");
////            }
////        };
////        anonymous_class anmObj2 = new anonymous_class() {
////            @Override
////            void printName() {
////                System.out.println("Anonymous class object 2 ");
////            }
////        };
////        anmObj.printName();
////        anmObj2.printName();
////    }
////}