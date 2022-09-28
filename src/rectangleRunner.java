import java.util.Scanner;

public class rectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        rectangle rect1 = new rectangle(rect1Length, rect1Width);
        System.out.println("Rectangle 1's Area: " + rect1.calculateArea() + ", Box Volume: " + rect1.calculateBoxVolume(rect1Height));

        rectangle rect2 = new rectangle(rect2Length, rect2Width);
        System.out.println("Rectangle 2's Area: " + rect2.calculateArea() + ", Box Volume: " + rect2.calculateBoxVolume(rect2Height));


    }
}

