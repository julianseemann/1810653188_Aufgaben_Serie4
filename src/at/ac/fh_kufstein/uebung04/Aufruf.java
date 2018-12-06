package at.ac.fh_kufstein.uebung04;

import at.ac.fh_kufstein_kufstein04.Classes.Car;

public class Aufruf
{
    public static void main(String[]args)
    {
        Car neuesAuto = new Car("red", 4, 200.0);
        neuesAuto.accelerate(80.0);
        neuesAuto.slowdown(45.0);

        neuesAuto.currentSpeed();

        neuesAuto.getSpeed();
        neuesAuto.getColor();
        neuesAuto.getWheels();

    }
}
