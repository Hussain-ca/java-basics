public class ReverseArray {
    public static void main(String[] args){
        int temp;
        int[] numbers = {10,20,30,40,50};

        for(int i=0; i<(numbers.length)/2;i++){
            temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
