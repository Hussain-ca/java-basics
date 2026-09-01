public class CountGreaterThanAverage {
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        int sum =numbers[0];
        int count=0;
        for(int i = 1; i<numbers.length;i++){
            sum+=numbers[i];
        }
        double average=(double)sum/ numbers.length;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>average){
                count++;
            }
        }
        System.out.print("Average = "+average+"\nNumbers greater than average = "+count);

    }
}
