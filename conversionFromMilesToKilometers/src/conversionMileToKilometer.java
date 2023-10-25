public class conversionMileToKilometer {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Miles           Kilometers");
        
        int miles = 1;

        //Create a while a loop to run ten times. 
        while (miles <=  10) { 

           //Convert the miles to kilometers.
            double kilometers = miles * 1.609;

            //The %-15d means the integer (mile) will be left-justified and take up to 15 spaces.
            //The %.3f means the floating point number (kilometers) will be formatted with 3 decimal places.
            System.out.printf("%-15d %.3f\n", miles, kilometers);
            miles++;
        }  
    }
}
