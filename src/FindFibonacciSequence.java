import java.util.Scanner;

public class FindFibonacciSequence {


    public static void main(String[] args) {

        int n;
        int v1 = 1;
        int v2 = 1;
        int fibonacci = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number to find the n fibonacci");
        n = scan.nextInt();


        for (int i=0; i<n-2; i++) {
            fibonacci = v1+v2;
            v1=v2;
            v2=fibonacci;

        }
        System.out.println(fibonacci);



    }



}
