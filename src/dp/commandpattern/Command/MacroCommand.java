/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.Command;

/**
 *
 * @author st801
 */
public class MacroCommand implements Command {
    Command[] commands;
    
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        
    }
    
}
