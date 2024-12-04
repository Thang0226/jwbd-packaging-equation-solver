import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parameters of quadratic equation: ");
        System.out.print("\ta = ");
        double a = sc.nextDouble();
        System.out.print("\tb = ");
        double b = sc.nextDouble();
        System.out.print("\tc = ");
        double c = sc.nextDouble();

        Solver.solve(a, b, c);
    }
}
