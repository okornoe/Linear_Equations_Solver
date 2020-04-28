package solver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation1 = scanner.nextLine();
        String[] eq1 = equation1.split("\\s+");
        double a = Double.parseDouble(eq1[0]);
        double b = Double.parseDouble(eq1[1]);
        double c = Double.parseDouble(eq1[2]);

        String equation2 = scanner.nextLine();
        String[] eq2 = equation2.split("\\s+");
        double d = Double.parseDouble(eq2[0]);
        double e = Double.parseDouble(eq2[1]);
        double f = Double.parseDouble(eq2[2]);

        double y = (f - c * (d / a)) / (e - b * (d / a));
        double x = (c - (y * b)) / a;
        System.out.println(x + " " + y);
        //System.out.printf("%.5f %.5f",x,y);
    }
}
