import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaExpExample {
    public static void main(String[] args) {
        //Added in Java 8
//        A lambda expression is a short block of code which takes in parameters and
//        returns a value.Lambda expressions are similar to methods,
//        but they do not need a name and they can be implemented
//        right in the body of a method.

//        Syntax
//        parameter -> expression
//        (parameter1, parameter2) -> expression
//        Expressions are limited. They have to immediately return a value,
//        and they cannot contain variables, assignments or statements such as if or for.
//        In order to do more complex operations, a code block can be used with curly braces.
//        If the lambda expression needs to return a value, then the code block should have
//        a return statement.

//        (parameter1, parameter2) -> { code block }

//        Lambda expressions are usually passed as parameters to a function

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(9);
            numbers.add(8);
            numbers.add(1);
            numbers.forEach((ele) ->
                System.out.println(ele)
            );

//        Lambda expressions can be stored in variables if the variable's type is an interface
//        which has only one method. The lambda expression should have the same number
//        of parameters and the same return type as that method.
//        For example : one of the such interface provided by Java is Consumer interface

//        consider previous ArrayList numbers

//        Consumer<Integer> method = (n) -> { System.out.println(n); } ;
//        numbers.forEach( method );
//        }
//    }

//***************** Lambda expression in a method
//        To use a lambda expression in a method,
//        the method should have a parameter with a single-method interface as its type
//        Calling the interface's method will run the lambda expression
//        interface StringFunction {
//            String run(String str);
//        }
//
//        public class Main {
//            public static void main(String[] args) {
//                StringFunction exclaim = (s) -> s + "!";
//                StringFunction ask = (s) -> s + "?";
//                printFormatted("Hello", exclaim);
//                printFormatted("Hello", ask);
//            }
//            public static void printFormatted(String str, StringFunction format) {
//                String result = format.run(str);   //    Hello!,   Hello?
//                System.out.println(result);
//            }
//        }


//**************************  Return statement
//        A return statement is not an expression in a lambda expression.
//        We must enclose statements in braces ({}). However, we do not have to enclose
//        a void method invocation in braces. The return type of a method in which lambda
//        expression used in a return statement must be a functional interface.

//        public class LambdaReturnTest2 {
//            public static void main(String args[]) {
                Thread th = new Thread(getRunnable());
                th.run();
            }
            public static Runnable getRunnable() {
                return() -> {    // lambda expression return statement
                    System.out.println("Lambda Expression Return Statement");
                };
            }
        }

