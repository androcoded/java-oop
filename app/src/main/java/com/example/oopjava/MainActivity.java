package com.example.oopjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car myCar = new Car("Toyota",2016,"Auto",200);
        Log.i("mytag",myCar.getBrandName().toString()+myCar.getGearMode().toString());
        Log.i("myobj",myCar.toString());
        myCar.setBrandName("Mazda");
        Log.i("mytag",myCar.getBrandName().toString()+myCar.getGearMode().toString());
        Log.i("mytag",myCar.getBrandName().toString())
        ;
        myCar.setmNumberOfWheel(4);
        Car.setmNumberOfWheel(6);

        Car newCar =new Car("Audi",2018,"Manual",210);
        Log.i("myWheel",newCar.getmNumberOfWheel()+"");
        PersonalCar myPerCar = new PersonalCar("A",2010,"Auto",205);
        Log.i("inherit",myPerCar.getBrandName()+"");
    }
}
