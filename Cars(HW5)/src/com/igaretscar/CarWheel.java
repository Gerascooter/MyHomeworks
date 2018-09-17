package com.igaretscar;

public class CarWheel
{
    public float getWheelState() {
        return wheelState;
    }

    private float wheelState;

    public CarWheel(float wheelState) {
        this.wheelState = wheelState;
    }

    public void setNew()
    {
        wheelState = 1;
    }

    public void useWheel(float x)
    {
        wheelState -= x;
    }

    public CarWheel() {
        wheelState = 1;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "wheelState=" + wheelState +
                '}';
    }
}
