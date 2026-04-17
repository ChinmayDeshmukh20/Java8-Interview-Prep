package StringJava8Questions.FunctionalInterface;

public interface DefaultMethodInterface {

    // interface can have default methods with implementation

    void myTvAbstractMethod();

    //default method

    default void myTvDefaultMethod(String tvName)          // // actually: public default void myTvDefaultMethod()
    {
        System.out.println("Name of my tv in default method : " + tvName);
    }



        //In an interface:
    //
    //Every method is implicitly public
    //So a default method is always public, even if you don’t write it



}
