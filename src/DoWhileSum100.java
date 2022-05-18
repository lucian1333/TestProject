import java.util.Scanner;

public class DoWhileSum100 {

    public static void main(String[] args) {

        int user;
        int sum=0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter an integer between 1 and 100");
            user = scan.nextInt();
            sum += user;

        } while (sum<=100);
        if (sum > 100) {
            System.out.println("The sum of our entered numbers is: "+sum);
        }



    }
}
