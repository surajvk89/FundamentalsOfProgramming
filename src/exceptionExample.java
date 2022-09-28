import java.lang.Throwable;
import java.lang.reflect.Array;
import java.util.Scanner;

//try-catch
public class exceptionExample{
    public static void main(String[] args) throws ArithmeticException,NullPointerException, ArrayIndexOutOfBoundsException {
        int x;
        int y;
        int result = 0 ;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        String name =  "ABC";
        int []arr=new int[5];
        try{
//            if(y==0){
//                throw new ArithmeticException("can not divide by zero");
//            }
            result = x/y;
            System.out.println(name.length() + arr[6]);

        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage() + ae.getClass());
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage() + npe.getClass());
        }catch(Exception e){
            System.out.println(e.getMessage() + e.getClass());
        }finally {
            System.out.println("Result" + result);
            System.out.println("Finally block");
        }
        System.out.println("Rest of the code");

        try{
            try{

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
