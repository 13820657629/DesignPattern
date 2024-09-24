package com.designPattern.BehavioralPatterns.CommandPattern;


//调用者
public class RemoteControl {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
