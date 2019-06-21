package com.example.kchef;

public class ToolType implements Tools {
    public void use(){
        System.out.println("Using the tool");
    }

    public void stop(){
        System.out.println("Stop using the tool");
    }
}
