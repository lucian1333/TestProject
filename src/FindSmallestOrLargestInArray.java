public class FindSmallestOrLargestInArray {


    public static void main(String[] args) {

        int[] numbers = {32, 7, 12, 77, 54, 89, 112, 33, 200};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i=0; i< numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: "+smallest+"\n and the largest is: "+largest);




    }
}
