import java.lang.Throwable;
import java.lang.reflect.Array;

//try-catch
public class exceptionExample{
    public static void main(String[] args) throws ArithmeticException,NullPointerException, ArrayIndexOutOfBoundsException {
        int x=10;
        int y[]={0};
        try{
            if(y[0]==0){
                throw new ArithmeticException("can not divide by zero");
            }
            int result = x/y[1];

        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage() + ae.getClass());
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage() + npe.getClass());
        }catch(Exception e){
            System.out.println(e.getMessage() + e.getClass());
        }finally {
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
