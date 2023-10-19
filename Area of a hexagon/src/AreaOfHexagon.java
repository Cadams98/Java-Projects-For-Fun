import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) throws Exception {
        
        // Create a scanner to read the users input. 
        Scanner scanner = new Scanner(System.in);


        // Prompt the user for side.
        System.out.println("Enter the side: ");
        double s = scanner.nextDouble();

        // Compute the area of the hexagon using the tangent formula. 
        double area = (6 * Math.pow(s, 2))/ (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + area);

    }
}
