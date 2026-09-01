import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n : ");
        int n = scanner.nextInt();
        if(n>0)
        {
            int sum=0;
            for(int i=n ; i>0; i--)
            {
                sum = sum+i;

            }
            System.out.println("Sum = " + sum);
        }
        else{System.out.println("Enter only positive integers");}


    }
}
