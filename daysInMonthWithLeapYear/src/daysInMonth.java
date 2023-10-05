import java.util.Scanner;

public class daysInMonth {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get Input from User
        System.out.print("Enter the month (1-12): ");
        int monthNumber = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        int daysInMonth;
        String monthName;
        
        // Determine the number of days in the month
        if (monthNumber == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
        
        // Determine the name of the month
        switch(monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month"; break;
        }
        
        // Display Result
        System.out.println(monthName + " " + year + " had " + daysInMonth + " days.");
    }
}