import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) throws Exception {
        
        //Make a scanner variable to get the users input.
        Scanner scanner = new Scanner(System.in);  
        
        //Output to the user to get the letter. 
        System.out.println("Please enter in a letter.  :");
        
        //Make the input to a string datatype. 
        String input = scanner.nextLine();

        //The line first checks if the input is one character then it checks if the input is a letter to push it through the nested loop. 
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            //Changes the uppercase letter to lowercase. 
            char letter = Character.toLowerCase(input.charAt(0));

            //Check if the lowercase letter is a vowel.
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is a consonant");
            }

        //If the input is not a single letter this messaged will be displayed. 
        } else {
            System.out.println(input + " is an invalid input");
        }


    }
}
