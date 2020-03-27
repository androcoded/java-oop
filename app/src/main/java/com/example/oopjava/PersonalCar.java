package com.example.oopjava;

public class PersonalCar extends Car {

    public PersonalCar(String brandName, int modelYear, String gearMode, int highestSpeed) {
        super(brandName, modelYear, gearMode, highestSpeed);
    }

    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    @Override
    public void setBrandName(String brandName) {
        super.setBrandName(brandName);
    }

    @Override
    public int getModelYear() {
        return super.getModelYear();
    }

    @Override
    public void setModelYear(int modelYear) {
        super.setModelYear(modelYear);
    }

    @Override
    public String getGearMode() {
        return super.getGearMode();
    }

    @Override
    public void setGearMode(String gearMode) {
        super.setGearMode(gearMode);
    }

    @Override
    public int getHighestSpeed() {
        return super.getHighestSpeed();
    }

    @Override
    public void setHighestSpeed(int highestSpeed) {
        super.setHighestSpeed(highestSpeed);
    }
}
