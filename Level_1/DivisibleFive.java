import java.util.Scanner;

public class DivisibleFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int no = sc.nextInt();
        if (no % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("The number is not divisible by 5");
        }
    }
}
