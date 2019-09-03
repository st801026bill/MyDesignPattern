/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remote;

import dp.commandpattern.Command.Command;
import dp.commandpattern.Command.NoCommand;

/**
 *
 * @author st801
 */
public class RemoteControl {
    final int commandCount = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[commandCount];
        offCommands = new Command[commandCount];
        Command noCommand = new NoCommand();
        
        for(int i=0; i<commandCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onBtnPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offBtnPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoBtnPressed() {
        undoCommand.undo();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- 遙控器 -----\n");
        for(int i=0; i<commandCount; i++) {
            sb.append(
                "[slot-"+ i +"] "+ onCommands[i].getClass().getName()+"    "+
                "[slot-"+ i +"]"+ offCommands[i].getClass().getName()+"\n"
            );
        }
        return sb.toString();
    }
}
