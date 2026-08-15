public class SumEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 20, 8, 11, 14};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.print("Sum of even numbers = "+sum);

    }
}
