public class Solver {
    public static void main(String[] args) {
        // test code
        double a = 4, b = 15, c = 6;
        Solver.solve(a, b, c);
    }

    public static void solve(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("No solution");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Equation has one double root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Equation has two roots:");
            System.out.println("\tRoot1: " + root1);
            System.out.println("\tRoot2: " + root2);
        }
    }
}
