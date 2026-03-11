
import java.util.Scanner;

public class Level2Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        float a = sc.nextFloat();
        System.out.print("Enter second no : ");
        float b = sc.nextFloat();
        System.out.println("Sum : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product : " + (a * b));
        System.out.println("Divident : " + (a / b));

    }
}
