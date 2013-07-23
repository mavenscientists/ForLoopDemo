package forloopdemo;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 21, 2013 9:55:33 AM 
 */
public class ForLoopDemo {

    public static void main(String[] args)
    {
        int I;
        int[] numbers = {1, 2, 3, 4, 5};
        
        for(I = 1; I < 5; I++ )
        {
            System.out.println("I : " + I);
        }
        
        //Enhanced For Loop (Supported by Java SE 7 and above only)
        System.out.println("\nUsing Enhanced For Loop :");
        for(int N : numbers)
        {
            System.out.println("N : " + N);
        }
        
    }

}
