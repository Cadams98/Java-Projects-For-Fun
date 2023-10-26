public class financialApplicationComputeFutureTuition {
    public static void main(String[] args) throws Exception {
        // Initial tuition.
        double tuition = 10000;
        //The interest rate 
        double interest = 0.05;

        //Compute tuition in ten years.
        for (int i = 1; i <= 10; i++) {
            tuition = tuition + (tuition * interest);
        }
        System.out.printf("The tuition in ten years will be: $%.2f\n", + tuition);

        //Compute the tution 4 years after the ten year. 
        double totalCost = 0;
        for (int i = 1; i <= 4; i++);{
            totalCost += tuition;
            tuition = tuition + (tuition * interest);
        }
        System.out.printf("The total tuition cost for four years after the tenth year will be: $%.2f\n", totalCost);
    }
}
