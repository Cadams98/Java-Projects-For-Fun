import java.util.Scanner;

public class financialApplicationCalculateTips {
    public static void main(String[] args) throws Exception {
        
        //Declare the variables
        double gratuity;
        int subtotal;
        double total;
        double totalGratuity;

 
        //Display a message to user to enter in subtotal.
        System.out.println("Enter in the subtotal.");
        
        //Make a scanner to declare the users subtotal input.
        Scanner st = new Scanner(System.in);
        subtotal = st.nextInt();

        //Display a message to user to enter gratuity percent.
        System.out.println("Enter in the gratuity percent you would like to tip.");

        //Make a scanner to declare the users gratuity.
        Scanner g = new Scanner(System.in);
        gratuity = g.nextInt();

        gratuity = (double)gratuity/100;

        //This formula gives the total amount that is going to be tipped.
        totalGratuity = (double)subtotal*gratuity;

        //This formula gives the total amount on the bill.
        total = (double)subtotal + totalGratuity;

        System.out.println("The gratuity is $" 
        +totalGratuity 
        +" and total is $" 
        +total);



        
        
        
    }
}
