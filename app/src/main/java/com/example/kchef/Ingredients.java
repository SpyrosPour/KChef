package com.example.kchef;

public class Ingredients {
    private String name;

    public Ingredients(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*private Ingredients salt = new Ingredients("salt");
    private Ingredients pepper = new Ingredients("pepper");
    private Ingredients oil = new Ingredients("oil");
    private Ingredients tomato = new Ingredients("tomato");
    private Ingredients cucumber = new Ingredients("cucumber");
    private Ingredients flour = new Ingredients("flour ");
    private Ingredients egg = new Ingredients("egg");
    private Ingredients butter = new Ingredients("butter");
    private Ingredients sugar = new Ingredients("sugar");
    private Ingredients water = new Ingredients("water");*/

    public String getSaladIng(){
        return "salt + pepper + oil + tomato + cucumber";
    }
}
