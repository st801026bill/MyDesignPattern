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
import dp.commandpattern.object.CeilingFan;
import dp.commandpattern.remote.RemoteControl;

/**
 *
 * @author st801
 * 每個物件有多狀態。
 * 1. 設定遙控器並建立7個Command(RemoteControl)
 * 2. 沒定義的插槽預設NoCommand(不實作任何程式)
 * 3. 提供undo復原功能
 */
public class TestCommandPattern3 {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        CeilingFan ceilingFan = new CeilingFan("臥室");
        
        CeilingFanHighCommand ceilingFanHigh        = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium    = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow          = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff          = new CeilingFanOffCommand(ceilingFan);
        //設置遙控器
        remoteControl.setCommand(0,     ceilingFanLow,      ceilingFanOff);
        remoteControl.setCommand(1,     ceilingFanMedium,   ceilingFanOff);
        remoteControl.setCommand(2,     ceilingFanHigh,     ceilingFanOff);
        
        remoteControl.onBtnPressed(0);
        remoteControl.offBtnPressed(0);
        remoteControl.undoBtnPressed();
        
        remoteControl.onBtnPressed(1);
        remoteControl.undoBtnPressed();
    }
}
