/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern;

import dp.commandpattern.Command.CeilingFanHighCommand;
import dp.commandpattern.Command.CeilingFanLowCommand;
import dp.commandpattern.Command.CeilingFanMediumCommand;
import dp.commandpattern.Command.CeilingFanOffCommand;
import dp.commandpattern.Command.Command;
import dp.commandpattern.Command.LightOffCommand;
import dp.commandpattern.Command.LightOnCommand;
import dp.commandpattern.Command.MacroCommand;
import dp.commandpattern.Command.StereoOffWithCDCommand;
import dp.commandpattern.Command.StereoOnWithCDCommand;
import dp.commandpattern.object.CeilingFan;
import dp.commandpattern.object.Light;
import dp.commandpattern.object.Stereo;
import dp.commandpattern.remote.RemoteControl;

/**
 *
 * @author st801
 * 巨集命令
 * 1. 一鍵執行多種命令
 */
public class TestCommandPattern4 {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light light = new Light("臥室");
        Stereo stereo = new Stereo("臥室");
        CeilingFan ceilingFan = new CeilingFan("臥室");
        
        LightOnCommand lightOn                  = new LightOnCommand(light);
        LightOffCommand lightOff                = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOn          = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff        = new StereoOffWithCDCommand(stereo);
        CeilingFanHighCommand ceilingFanHigh    = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff      = new CeilingFanOffCommand(ceilingFan);
        
        Command[] partyOn  = {lightOn, stereoOn, ceilingFanHigh};
        Command[] partyOff = {lightOff, stereoOff, ceilingFanOff};
        
        MacroCommand partyOnMarco = new MacroCommand(partyOn);
        MacroCommand partyOffMarco = new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, partyOnMarco, partyOffMarco);
        
        remoteControl.onBtnPressed(0);
        remoteControl.offBtnPressed(0);
    }
}
