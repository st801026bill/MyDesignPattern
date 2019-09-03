/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.Command;

import dp.commandpattern.object.CeilingFan;
import dp.commandpattern.object.CeilingFan.LEVEL;

/**
 *
 * @author st801
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    LEVEL prevSpeed;
    
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        System.out.print("(復原)");
        switch(prevSpeed) {
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
    
}
