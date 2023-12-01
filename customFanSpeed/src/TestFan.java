// Class to test the functionality of the Fan class
public class TestFan {
    public static void main(String[] args) {
        // Create and configure the first fan
        Fan firstFan = new Fan();
        firstFan.setSpeed(Fan.SPEED_FAST); // Set speed to FAST
        firstFan.setRadius(10.0); // Set radius to 10
        firstFan.setColor("yellow"); // Set color to yellow
        firstFan.turnOn(); // Turn the fan on

        // Create and configure the second fan
        Fan secondFan = new Fan();
        secondFan.setSpeed(Fan.SPEED_MEDIUM); // Set speed to MEDIUM
        secondFan.turnOff(); // Turn the fan off

        // Print the state of both fans
        System.out.println("First Fan: " + firstFan);
        System.out.println("Second Fan: " + secondFan);

        //Thank you, Professor Fiskey, for teaching everyone how to land a career in the software field.  
    }
}
