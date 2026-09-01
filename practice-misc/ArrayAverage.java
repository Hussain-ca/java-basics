import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers?: ");
        int numbers = scanner.nextInt();
        while(numbers<1){
            System.out.print("Invalid. Enter a positive number: ");
            numbers= scanner.nextInt();
        }
        int[] array = new int[numbers];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter number "+(i+1)+" :");
            array[i]=scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum=sum+array[i];
        }
        double average = (double)sum/numbers;

        System.out.print("Sum = "+sum);
        System.out.print("\nAverage = "+average);



    }

}
