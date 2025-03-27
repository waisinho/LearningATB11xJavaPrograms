package Tasks;

public class Task015_SecondLargestNum {
    public static void main(String[] args) {
        int [] numbers = {25,35,45,55,65,75,85,95,100};
        int firstLargest = 0;
        int secondLargest = 0;

        for (int i =0; i<numbers.length; i++){
            if(numbers[i]>firstLargest){

                secondLargest = firstLargest;
                firstLargest = numbers[i];

            } else if (numbers[i]>secondLargest && numbers[i]!=firstLargest) {
                secondLargest = numbers[i];

            }
        }//ends for loop
        System.out.println("The Second largest number is " + secondLargest);

    }//ends main

}

