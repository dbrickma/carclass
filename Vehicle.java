package com.danbrickman;

public class Vehicle {
    private String name;
    private String engine;
    private int gas;
    private int diesel;
    private int doors;
    private int wheels;
    private int terrain;
    //private double speed;





    public Vehicle(String name,String engine, int gas, int diesel, int doors, int wheels, int terrain){
        this.name = name;
        this.engine = engine;
        this.gas = gas;
        this.diesel = diesel;
        //string for this fuel
        //motor is something vehicles should have
        this.doors = doors;
        this.wheels = wheels;
        this.terrain = terrain;
        //this.speed = speed;



    }
    public void turn(String direction){
        System.out.println("Vehicle moving " + direction);

    }

    public int move(int speed){
        System.out.println("Vehicle moving at " + speed + "speed");
        return speed;
    }

    public boolean start(boolean on) {
        if (on == true) {
            System.out.println("Vehicle is on with" + engine + "running");
            System.out.println("VROOOM");
            return on;

        }
    return false;}


    public String getName(){
        return name;
    }

    public String getEngine(){

        return engine;
    }

    public int getGas(){
        return gas;
    }

    public int getDiesel(){
        return diesel;

    }

    public int getWheels(){
        return wheels;
    }

    public int getDoors(){
        return doors;
    }

    public int getTerrain(){
        return terrain;
    }

}


