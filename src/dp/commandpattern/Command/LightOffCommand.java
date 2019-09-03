/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.Command;

import dp.commandpattern.object.Light;
import dp.commandpattern.object.Light;

/**
 *
 * @author st801
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
    
    @Override
    public void undo() {
        System.out.print("(復原)");
        light.on();
    }
}
