package com.igaretscar;

public class CarDoor
{
    private boolean door;
    private boolean window;

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public CarDoor() {
    }

    public void openDoor()
    {
       door = true;
    }

    public void openWindow()
    {
        window = true;
    }

    public void closeDoor()
    {
        door = false;
    }

    public void closeWindow()
    {
        window = false;
    }

    public void openCloseDoor()
    {
        door = !door;
    }

    public void openCloseWindow()
    {
        window = !window;
    }

    public boolean isDoorOpen() {
        return door;
    }

    public boolean isWindowOpen() {
        return window;
    }

    @Override
    public String toString() {
        return "CarDoor{" +
                "door=" + door +
                ", window=" + window +
                '}';
    }
}
