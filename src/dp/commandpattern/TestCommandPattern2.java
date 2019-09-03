/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern;

import dp.commandpattern.Command.GarageDoorDownCommand;
import dp.commandpattern.Command.GarageDoorUpCommand;
import dp.commandpattern.Command.LightOffCommand;
import dp.commandpattern.Command.LightOnCommand;
import dp.commandpattern.Command.StereoOffWithCDCommand;
import dp.commandpattern.Command.StereoOnWithCDCommand;
import dp.commandpattern.object.GarageDoor;
import dp.commandpattern.object.Light;
import dp.commandpattern.object.Stereo;
import dp.commandpattern.remote.RemoteControl;

/**
 *
 * @author st801
 * 每個物件有(on, off)兩種狀態。
 * 1. 設定遙控器並建立7個Command(RemoteControl)
 * 2. 沒定義的插槽預設NoCommand(不實作任何程式)
 * 3. 提供undo復原功能
 */
public class TestCommandPattern2 {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light livingRoomLight = new Light("臥室");
        Light kitchenLight = new Light("廚房");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("臥室");
        
        //臥室燈
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        //廚房燈
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        //車庫門
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        //音響
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        
        //設置遙控器
        remoteControl.setCommand(0,     livingRoomLightOn,  livingRoomLightOff);
        remoteControl.setCommand(1,     kitchenLightOn,     kitchenLightOff);
        remoteControl.setCommand(2,     garageDoorUp,       garageDoorDown);
        remoteControl.setCommand(3,     stereoOnWithCD,     stereoOffWithCD);
        
        System.out.println(remoteControl.toString());
        
        remoteControl.onBtnPressed(0);
        remoteControl.offBtnPressed(0);
        remoteControl.onBtnPressed(1);
        remoteControl.offBtnPressed(1);
        remoteControl.onBtnPressed(2);
        remoteControl.offBtnPressed(2);
        remoteControl.onBtnPressed(3);
        remoteControl.offBtnPressed(3);
        remoteControl.undoBtnPressed();
        
    }
}
