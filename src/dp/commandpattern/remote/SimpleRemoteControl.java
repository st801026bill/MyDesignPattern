/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remote;

import dp.commandpattern.Command.Command;

/**
 *
 * @author st801
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}
    
    public void setCommand(Command command) {
        slot = command;
    }
    
    public void btnPressed() {
        slot.execute();
    }
}
