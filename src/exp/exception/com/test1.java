package exp.exception.com;


import com.edureka.scope_test;
   // All these variables are used in another package as given below:



public class test1
{
    public static void main (String args[])
    {
        scope_test t1 = new scope_test();
   //     System.out.println(t1.priv_data) ;
   //     System.out.println(t1.prot_data)  ;
    //    System.out.println(t1.pack_data) ;
        System.out.println(t1.pub_data) ;
    }
}

   // Which are the variables accessible in test1 class
