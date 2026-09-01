public class CountOccurrences {
    public static void main(String[] args){
        int[] numbers = {5,2,5,7,5,9,2,5};
        int target =5;
        int count=0;
        for (int i=0; i< numbers.length;i++){
            if(numbers[i]==target){
            count = count+1;}
        }
        System.out.print("Target "+target+" appears "+count+" times");
    }
}
