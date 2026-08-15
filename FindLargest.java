public class FindLargest {
    public static void main(String[] args){
        int[] numbers = {14,7,92,31,5,68};
        int largest = numbers[0];
        for (int i=1; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.print("Largest = "+largest);

    }
}
