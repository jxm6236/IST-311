/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fanspeed;

/**
 *
 * @author jmhaz
 */
public class FanSpeed {

    /**
     * @param args the command line arguments
     */
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public static void main(String[] args) {
        // TODO code application logic here
        FanSpeed fan1 = new FanSpeed();
        fan1.speed = fan1.FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        System.out.println(fan1.toString());
        FanSpeed fan2 = new FanSpeed();
        fan2.speed = fan2.MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println(fan2.toString());
    }
    
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public FanSpeed() {

    }

    public String toString() {
        if (on) {
            return "A " + radius + " inch " + color + " fan at high speed of " + speed;
        } else {
            return "A " + radius + " inch " + color + " fan; fan is off";
        }
    }
    
}
