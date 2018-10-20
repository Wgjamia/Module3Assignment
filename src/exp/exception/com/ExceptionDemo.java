package exp.exception.com;

public class ExceptionDemo {
    public static void main(String[] args){
        System.out.println("===Main Started===");

        int[] arr = {10,20,30,40,50,60};
        try {
            System.out.println("arr[30] is:"+arr[30]);

        }catch (ArrayIndexOutOfBoundsException eRef){
           //System.out.println("Some Exception Occurred !! ");
           // System.out.println("Some Exception:"+eRef);
            eRef.printStackTrace();
        }



        int a =10, b= 3, c =0;
        try {
            c= a/b;
        }catch (ArithmeticException aRef){
            System.out.println("Some Exception Occurred!!");
        }

        System.out.println("C is :"+c);

        System.out.println("This is Awesome");

        System.out.println("===Main Finished===");
    }
}
