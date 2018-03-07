package com.danbrickman;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Car extends Vehicle {

    private boolean fourWheelDrive;
    private String carSizeType;
    private boolean automatic;
    private int gears;
    private boolean horn;
    private boolean gasBreakPedals;
    private int handSteering;
    private int year;
    private String make;
    private String model;


    public Car(int windows, int doors, int terrain, boolean fourWheelDrive, String carSizeType,
               boolean automatic, int gears, boolean horn, boolean gasBreakPedals, int handSteering,
               int year, String make, String model) {
        super("Car", "v6", 1, 0, doors, 4, 1);
        this.fourWheelDrive = fourWheelDrive;
        this.carSizeType = carSizeType;
        this.automatic = automatic;
        this.gears = gears;
        this.horn = true;
        this.gasBreakPedals = true;
        this.year = year;
        this.make = make;
        this.model = model;
        this.handSteering = handSteering;
        if (this.handSteering < 0 || this.handSteering > 3) {
            System.out.println("No direction");

        }


    }

    public int gearshift(int gear, boolean on) {
        start(on);
        if ((gears > 7 || gears < 4) || start(false) || (gear < 1 && gear > 7)) {
            System.out.println("Invalid gear shift");
            return -1;

        } else {
            System.out.println("Shifted to gear" + gear);
            return gear;


        }


    }

    public void gearshiftSpeed(int gear, boolean on) {

        gearshift(gear, on);
        if (on == false) {
            System.out.println("Engine off");
        } else if (gear == 1) {
            System.out.println("0 mph");


        } else if (gear == 2) {
            System.out.println("5-15 mph");

        } else if (gear == 3) {
            System.out.println("15-30 mph");
        } else if (gear == 4) {
            System.out.println("30-40 mph");
        } else if (gear >= 5) {
            System.out.println("40 mph upwards");
        } else {
            System.out.println("Issue with the car");
        }

    }

    public void honkHorn(boolean horn) {
        if (horn == true) {
            System.out.println("AWOOOOOOOOOOOOGA!");
        } else {
            System.out.println("silence");
        }
    }

    public boolean reverse(boolean back, boolean on) {
        if (back == true && start(true)) {
            System.out.println("Car is in reverse");
            return back;

        } else {
            System.out.println("car is in drive");
            return back;
        }
    }


    public void turn(boolean on, boolean back) {
        //handSteering 0 == right, 1 == left, 3 == straight
        if (start(on) == false){
            System.out.println("Car isn't on so can't turn");
    } else if ((handSteering == 0) && (back == true && on == true)) {
            System.out.println("Back right");
        } else if ((handSteering == 1) && (back ==true && on == true)) {
            System.out.println("Back left");
        } else if ((handSteering == 0) && (back == false && on == true)) {
            System.out.println("Drive right");
        } else if ((handSteering == 1) && (back == false && on == true)) {
            System.out.println("Drive left");

        } else if ((handSteering == 3) && (back == false && on == true)) {
            System.out.println("Drive");
        } else if ((handSteering == 3) && (back == true && on == true)) {
            System.out.println("Reverse");

        }
    }

    @Override
    public void turn(String direction){
        System.out.println("Car must be on and in reverse or drive to turn");

        }


    @Override
    public int move(int speed){
        System.out.println("Car moving at " + speed + "speed");

       return speed;
    }
    public int getGears(){
        System.out.println(gears);
        return gears;
        }
    public String getMake(){
        System.out.println(make);
        return make;
    }
    public String getModel(){
        System.out.println(model);
        return model;
    }
    public String getCarSizeType(){
        System.out.println(carSizeType);
        return carSizeType;
    }
    public int getYear(){
        System.out.println(year);
        return year;
    }
    public int getHandSteering(){
        System.out.println(handSteering);
        return handSteering;
    }



}

