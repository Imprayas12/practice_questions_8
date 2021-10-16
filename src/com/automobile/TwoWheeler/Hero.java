package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

class Hero extends Vehicle {
    int volume;
    double radioStation;
    public int getSpeed(){
        return 100;
    }
    public void Radio(int f){
        volume=10;
        radioStation=10;
        if(f==1)
            volume++;
        else if(f==2);
            radioStation++;
    }
    @Override
    public String getModelName(){
        return null;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getOwnerName() {
        return null;
    }
}
class Honda extends Vehicle {
    int volume;
    void switchCD(){
        System.out.println("PLEASE TAKE YOUR CD FROM DRIVER");
    }
    public int getSpeed(){
        return 100;
    }
    public void cdPlayer(boolean s){
        if(s)
            switchCD();
        else
            System.out.println("CD being replayed");
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getOwnerName() {
        return null;
    }
}
class Test {
    public static void main(String[] args) {
        Hero obj1 = new Hero();
        System.out.println(obj1.getSpeed());
        System.out.println("Volume "+obj1.volume);
        System.out.println("Radio Station " + obj1.radioStation);
        obj1.Radio(1);
        obj1.Radio(2);
        System.out.println("Volume "+obj1.volume);
        System.out.println("Radio Station " + obj1.radioStation);
        Honda obj2 = new Honda();
        obj2.cdPlayer(true);
        System.out.println(obj2.getSpeed());
    }
}