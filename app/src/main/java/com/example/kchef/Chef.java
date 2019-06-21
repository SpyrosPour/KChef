package com.example.kchef;

public class Chef {

    public String makeSalad(){
            String jobs = "Order: Salad";
            Station station1 = new Station();
            station1.setStationStatus(true);
            jobs += "\nUsing station";
            VegTools v1 = new VegTools("knife");
            jobs += "\nGetting the " + v1.getName();
            Ingredients ing1 = new Ingredients("tomato");
            jobs += "\nCutting " + ing1.getName() ;
            Ingredients ing2 = new Ingredients("cucumber");
            jobs += "\nCutting " + ing2.getName();
            ManualTools m1 = new ManualTools("bowl");
            jobs += "\nPutting them in the " + m1.getName();
            jobs += "\nReady to serve";
            station1.setStationStatus(false);
            return jobs;
    }

    public String makeCookies(){
        String jobs = "Order: Cookies";
        Station station1 = new Station();
        station1.setStationStatus(true);
        jobs += "\nUsing station";
        ManualTools m1 = new ManualTools("bowl");
        jobs += "\nGetting the " + m1.getName();
        Ingredients ing1 = new Ingredients("butter");
        jobs += "\nAdding " + ing1.getName();
        Ingredients ing2 = new Ingredients("sugar");
        jobs += "\nAdding " + ing2.getName();
        Ingredients ing3 = new Ingredients("flour");
        jobs += "\nAdding " + ing3.getName();
        PastryTools p1 = new PastryTools("mixer");
        jobs += "\nPutting them into the " + p1.getName();
        ManualTools m2 = new ManualTools("pan");
        jobs += "\nPutting them in the pan";
        Oven oven = new Oven();
        oven.setTemperature(200);
        jobs += "\nPutting it in the oven for 20 minutes";
        oven.setTemperature(0);
        ManualTools m3 = new ManualTools("plate");
        jobs += "\nPutting them in the " +m3.getName();
        jobs += "\nReady to serve";
        station1.setStationStatus(false);
        return jobs;
    }

    public String makeSpaghetti(){
        String jobs = "Order: Spaghetti";
        Station station1 = new Station();
        station1.setStationStatus(true);
        ManualTools m1 = new ManualTools("bowl");
        jobs += "\nGetting the " + m1.getName();
        Ingredients ing1 = new Ingredients("eggs");
        jobs += "\nAdding " + ing1.getName();
        Ingredients ing2 = new Ingredients("flour");
        jobs += "\nAdding " + ing2.getName();
        Ingredients ing3 = new Ingredients("oil");
        jobs += "\nAdding " + ing3.getName();
        Ingredients ing4 = new Ingredients("water");
        jobs += "\nAdding " + ing4.getName();
        ElectricTools e1 = new ElectricTools("mixer");
        jobs += "\nPutting them into the " + e1.getName();
        PastaTools p1 = new PastaTools("pastaMaker");
        jobs += "\nPassing them through the " + p1.getName();
        ManualTools m2 = new ManualTools("pot");
        jobs += "\nGetting the " + m2.getName();
        jobs += "\nAdding " + ing4.getName();
        Fire fire1 = new Fire();
        fire1.setHeat(6);
        jobs += "\nPutting it in the fire";
        jobs += "\nAdding the spaghetti after boil for 4 minutes";
        ManualTools m3 = new ManualTools("plate");
        jobs += "\nPutting them in the " + m3.getName();
        fire1.setHeat(0);
        jobs += "\nReady to serve";
        station1.setStationStatus(false);
        return jobs;
    }
}
