import java.util.Scanner;

public class LineComparision {
    public static double lineLength() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        int y2 = sc.nextInt();

        int X = x2 - x1;
        int Y = y2 - y1;
        double length = Math.sqrt((X * X) + (Y * Y));
        return length;
    }
    public static void Comparison(double length1, double length2){
        if (length1 == length2)
            System.out.println("Line1 is equal to Line2");
        else
            System.out.println("Line1 is not equal to Line2");

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");

        System.out.println("Enter coordinate of line-1");
        double length1 = lineLength();
        System.out.println("Enter coordinate of line-2");
        double length2 = lineLength();
    }
}
