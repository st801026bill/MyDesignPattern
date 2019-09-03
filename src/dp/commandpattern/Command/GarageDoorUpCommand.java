/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.Command;

import dp.commandpattern.object.GarageDoor;
import dp.commandpattern.object.Light;

/**
 *
 * @author st801
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }
    
    @Override
    public void undo() {
        System.out.print("(復原)");
        garageDoor.off();
    }
}
