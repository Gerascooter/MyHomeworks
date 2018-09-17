package com.igaretscar;

import java.util.Arrays;
import java.util.Collection;

public class Car
{
    public final String date;
    public String engine;
    public float timeTo100;
    public int maxPasanger;
    public int countOfPassangers = 0;

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int currentSpeed;
    public CarDoor[] carDoors;
    public CarWheel[] carWheels;

    public void dellWheels()
    {
        carWheels = null;
    }

    public void addXNewWheels(int x)
    {
        carWheels = new CarWheel[x];
    }

    public float getMaxSpeed()
    {
        if (countOfPassangers <= 0)
            return 0;

        float min = Float.MAX_VALUE;
        for (int i = 0; i < carWheels.length; i++)
        {
            if (carWheels[i].getWheelState() < min)
            {
                min = carWheels[i].getWheelState();
            }
        }
        return min;
    }

    public CarDoor getDoor(int i)
    {
        return carDoors[i];
    }

    public CarWheel getWheel(int i)
    {
        return carWheels[i];
    }


    public void addPassanger()
    {
        countOfPassangers++;
    }

    public void delPassanger()
    {
        countOfPassangers--;
    }

    public void delAllPassanger()
    {
        countOfPassangers = 0;
    }

    public Car(String date) {
        this.date = date;
    }

    public Car(String date, String engine, float timeTo100, int maxPasanger, int countOfPassangers, int currentSpeed) {
        this.date = date;
        this.engine = engine;
        this.timeTo100 = timeTo100;
        this.maxPasanger = maxPasanger;
        this.countOfPassangers = countOfPassangers;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "date='" + date + '\'' +
                ", engine='" + engine + '\'' +
                ", timeTo100=" + timeTo100 +
                ", maxPasanger=" + maxPasanger +
                ", countOfPassangers=" + countOfPassangers +
                ", currentSpeed=" + currentSpeed +
                ", carDoors=" + Arrays.toString(carDoors) +
                ", carWheels=" + Arrays.toString(carWheels) +
                '}';
    }
}
