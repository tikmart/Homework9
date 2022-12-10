import java.util.Scanner;

public class Fibonacci {


    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;


    public static void main(String[] args) {
        // numbers count to be printed
        int count = 12;

        //print the first 2 nums
        System.out.print(n1 + " " +n2 + " ");

        //print the rest
        fibonacci(count - 2);

    }



    static void fibonacci(int i) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;


        if (i > 0) {
            System.out.print(n3 + " ");
             fibonacci(i - 1);
        }

    }
}
