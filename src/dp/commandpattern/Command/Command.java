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
public interface Command {
    public void execute();
    public void undo();
}
