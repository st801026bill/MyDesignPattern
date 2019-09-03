/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern;

import dp.commandpattern.Command.GarageDoorUpCommand;
import dp.commandpattern.remote.SimpleRemoteControl;
import dp.commandpattern.Command.LightOnCommand;
import dp.commandpattern.object.GarageDoor;
import dp.commandpattern.object.Light;

/**
 *
 * @author st801
 */
public class TestCommandPattern1 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light("廚房");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        
        //開燈
        remote.setCommand(lightOn);
        remote.btnPressed();
        //開車門
        remote.setCommand(garageDoorOpen);
        remote.btnPressed();
    }
}
