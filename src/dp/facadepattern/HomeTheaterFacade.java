/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern;

import dp.facadepattern.HomeTheater.Amplifier;
import dp.facadepattern.HomeTheater.Tuner;
import dp.facadepattern.HomeTheater.TheatherLights;
import dp.facadepattern.HomeTheater.Projector;
import dp.facadepattern.HomeTheater.Screen;
import dp.facadepattern.HomeTheater.CdPlayer;
import dp.facadepattern.HomeTheater.DvdPlayer;
import dp.facadepattern.HomeTheater.PopcornPopper;

/**
 *
 * @author st801
 */
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheatherLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(
            Amplifier amp, 
            Tuner tuner, 
            DvdPlayer dvd, 
            CdPlayer cd, 
            Projector projector, 
            TheatherLights lights, 
            Screen screen, 
            PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }
    
    public void watchMovie(String movie) {
        System.out.println("觀看電影...");
        popper.on();
        popper.pop();
        
        lights.dim(10);
        
        screen.down();
        
        projector.on();
        projector.wideScreenMode();
        
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolune(5);
        
        dvd.on();
        dvd.play(movie);
    }
    
    public void endMovie() {
        System.out.println("結束電影...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
