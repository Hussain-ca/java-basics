import java.util.Scanner;
public class MethodCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("\nAddition: "+add(firstNumber,secondNumber));
        System.out.println("Subtraction: "+subtract(firstNumber,secondNumber));
        System.out.println("Multiplication: "+multiply(firstNumber,secondNumber));

    }

    static int add(int x,int y){
        return x+y;
    }
    static int subtract(int x,int y){
        return x-y;
    }
    static int multiply(int x,int y){
        return x*y;
    }
}
