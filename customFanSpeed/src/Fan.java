// Class representing a fan with adjustable speed, color, radius, and on/off state
public class Fan {
    // Constants for fan speed
    public static final int SPEED_SLOW = 1;
    public static final int SPEED_MEDIUM = 2;
    public static final int SPEED_FAST = 3;

    // Instance variables
    private int speed; // Current speed of the fan
    private boolean isOn; // On/off state of the fan
    private double radius; // Radius of the fan
    private String color; // Color of the fan

    // Constructor to initialize with default values
    public Fan() {
        this.speed = SPEED_SLOW; // Default speed
        this.isOn = false; // Default is off
        this.radius = 5.0; // Default radius
        this.color = "blue"; // Default color
    }

    // Get current speed
    public int getSpeed() {
        return this.speed;
    }

    // Set fan speed
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    // Check if fan is on
    public boolean isOn() {
        return this.isOn;
    }

    // Turn the fan on
    public void turnOn() {
        this.isOn = true;
    }

    // Turn the fan off
    public void turnOff() {
        this.isOn = false;
    }

    // Get fan's radius
    public double getRadius() {
        return this.radius;
    }

    // Set fan's radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Get fan's color
    public String getColor() {
        return this.color;
    }

    // Set fan's color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Provide a string representation of the fan
    @Override
    public String toString() {
        if (this.isOn) {
            return String.format("Fan (On) - Speed: %d, Color: %s, Radius: %.1f", this.speed, this.color, this.radius);
        } else {
            return String.format("Fan (Off) - Color: %s, Radius: %.1f", this.color, this.radius);
        }
    }
}
