package Tasks;

public class Task016_OddEvenFromArray {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,6,10,14,17,77,89,100,112,23,35,};
        for (int i = 0; i <numbers.length; i++){
            if(numbers[i]%2 ==0){
                System.out.println("The number " + numbers[i] + " is Even.");

            }else {
                System.out.println("The number " + numbers[i] + " is odd.");
            }
        }
    }//ends main
}
