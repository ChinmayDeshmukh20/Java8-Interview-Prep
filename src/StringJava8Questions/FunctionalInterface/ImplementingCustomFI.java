package StringJava8Questions.FunctionalInterface;

public class ImplementingCustomFI implements customFunctionalInterface {

    // Way 1- by implementing method of interface explicitly
    @Override
    public int myMethodinCustomFunctionalInterface(int inputNumber) {
        // this method will take input number , double it and return
        return inputNumber*2;

    }






    public static void main(String[] args) {
//        ImplementingCustomFI obj = new ImplementingCustomFI();
//        int result =obj.myMethodinCustomFunctionalInterface(5);
//        System.out.println(result);
//

        // Anonymous Function
        customFunctionalInterface obj2 = new customFunctionalInterface() {


            @Override
            public int myMethodinCustomFunctionalInterface(int input) {
                return input*2;
            }
        };

        System.out.println(obj2.myMethodinCustomFunctionalInterface(8));



        customFunctionalInterface lambdaObj = (x) -> {return x*3;};

        System.out.println(lambdaObj.myMethodinCustomFunctionalInterface(10));
    }


}
