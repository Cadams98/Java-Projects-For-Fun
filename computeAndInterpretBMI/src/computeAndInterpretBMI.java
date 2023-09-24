import java.util.Scanner;

public class computeAndInterpretBMI {
    public static void main(String[] args) throws Exception {
        //Declared variables.
        int weight;
        int feet;
        int inches;
        double feetToInches;
        double height;
        double bmi;

        //Output to user to get weight input.
        System.out.println("Please enter in your weight in pounds.");
        Scanner w = new Scanner(System.in);
        weight = w.nextInt();

        //Output to user to get feet input.
        System.out.println("Please enter in your height in feet.");
        Scanner ft = new Scanner(System.in);
        feet = ft.nextInt();

        //Output to user to get inches input.
        System.out.println("Please enter in your height in inches.");
        Scanner i = new Scanner(System.in);
        inches = i.nextInt();

        //Turn feet to inches and add them together to get height. 
        feetToInches = (double) feet*12;
        height = (double) (inches + feetToInches);

        //This is the BMI formula. 
        bmi = (double) ((weight/(height*height))*703);
        
        
        System.out.println("Your BMI is: " + bmi);

        //This is a comparision to make the decision on Normal or Not. 
        if (bmi>=18.5&&bmi<=24.9)
            System.out.println("Your BMI is normal.");
        else 
            System.out.println("Your BMI is not normal.");
        




    }
}
