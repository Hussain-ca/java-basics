import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks between 0 -100 to calculate your grade: ");
        int marks = scanner.nextInt();
        if(marks >= 90 && marks <=100){
            System.out.println(" A Grade ");
        }
        else if(marks >= 80 && marks <=89){
            System.out.println(" B Grade ");
        }
        else if(marks >= 70 && marks <=79){
            System.out.println(" C Grade ");
        }
        else if(marks >= 60 && marks <=69){
            System.out.println(" D Grade ");
        }
        else if(marks >= 0 && marks <=59){
            System.out.println(" F Grade ");
        }
        else{
            System.out.println("Invalid mark");
        }
    }
}
