package com.example.oopjava;

public class Car {

    private String mBrandName;
    private int mModelYear;
    private String mGearMode;
    private int mHighestSpeed;

    private static int mNumberOfWheel;

    public static int getmNumberOfWheel() {
        return mNumberOfWheel;
    }

    public static void setmNumberOfWheel(int mNumberOfWheel) {
        Car.mNumberOfWheel = mNumberOfWheel;
    }

    public Car(String brandName, int modelYear, String gearMode, int highestSpeed) {
        this.mBrandName = brandName;
        this.mModelYear = modelYear;
        this.mGearMode = gearMode;
        this.mHighestSpeed = highestSpeed;
    }

    public String getBrandName() {
        return mBrandName;
    }

    public void setBrandName(String brandName) {
        mBrandName = brandName;
    }

    public int getModelYear() {
        return mModelYear;
    }

    public void setModelYear(int modelYear) {
        mModelYear = modelYear;
    }

    public String getGearMode() {
        return mGearMode;
    }

    public void setGearMode(String gearMode) {
        mGearMode = gearMode;
    }

    public int getHighestSpeed() {
        return mHighestSpeed;
    }

    public void setHighestSpeed(int highestSpeed) {
        mHighestSpeed = highestSpeed;
    }
}
