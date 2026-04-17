package StringJava8Questions.InterfaceImplementation;

import StringJava8Questions.FunctionalInterface.DefaultMethodInterface;

public class defaultMethodInterfaceImpl implements DefaultMethodInterface {

    @Override
    public void myTvAbstractMethod()
    {
        System.out.println("Inside myTvAbstractMethod implementation in class");
    }

    // public default void myTvDefaultMethod(String tvName) ........Not allowed
    @Override
    public void myTvDefaultMethod(String tvName)    // Only interfaces can have methods with a body using default
    {
        System.out.println("inside myTvDefault Method impl");
    }

    //Default methods are always public
    //Cannot override with protected/private

    //Interface methods are implicitly public, so overridden methods must also be public; Java doesn’t allow reducing visibility to preserve the contract."
    //Every method is implicitly public
    //So a default method is always public, even if you don’t write it


    public static void main(String[] args) {
        defaultMethodInterfaceImpl obj = new defaultMethodInterfaceImpl();
        obj.myTvAbstractMethod();
        obj.myTvDefaultMethod("TCL");




        Addition obj1 = new Addition();
        System.out.println(obj1.operate(1,2));


        MathOperation addition = (a, b) -> a + b;

        System.out.println(addition.operate(1,3));

    }

}



@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}



class Addition implements MathOperation
{
    @Override
    public int operate(int a , int b)
    {
        return a + b;
    }
}





