package at.ac.fh_kufstein_kufstein04.Classes;

import javax.swing.*;

public class Car
{
    String color;
    int wheels;
    double speed;

    public void currentSpeed()
    {
       System.out.println("Die Geschwindigkeit beträgt: " + speed);
    }

    public Car(String color, int wheels,double speed)
    {
        this.color=color;
        this.wheels=wheels;
        this.speed=speed;
    }

    public String getColor()
    {
        return color;
    }

    public int getWheels()
    {
        return wheels;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void accelerate(double geschwindigkeit)
    {
        this.speed= geschwindigkeit +speed;
    }

    public void slowdown(double geschwindigkeit)
    {
        this.speed= speed - geschwindigkeit;
    }
}

