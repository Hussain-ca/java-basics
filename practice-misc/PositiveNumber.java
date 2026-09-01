import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number= scanner.nextInt();
        while(number<=0)
        {
            System.out.print("Invalid, Try again: ");
            number = scanner.nextInt();
        }
        System.out.print("Accepted "+number);
    }
}
