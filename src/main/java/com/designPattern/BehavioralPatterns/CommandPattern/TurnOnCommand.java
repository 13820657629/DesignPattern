package com.designPattern.BehavioralPatterns.CommandPattern;

//具体命令
public class TurnOnCommand implements Command{
    private Light light;

    public TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
