import java.io.*;
import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) throws Exception {
        //Declare the variable
        int celsius;
        

        //Input the Celsius
        System.out.println("Please enter in your temperature in Celsius.");

        //Create Scanner Object
        Scanner celsiusInput = new Scanner(System.in);

        //Set celcius to celsiusInput
        celsius = celsiusInput.nextInt();

        //Set equation to convert Celcius to Fahrenheit note double needed for decimal place
        double fahrenheit = (double) (9.0/5)*celsius+32;

        //Display celsius,”Celsius is”, Fahrenheit,”Fahrenheit”
        System.out.println(celsius 
        + " Celsius is "
        + fahrenheit 
        + " Fahrenheit ");


    
    }
}
