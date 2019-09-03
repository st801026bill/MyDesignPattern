/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern;

import dp.facadepattern.HomeTheater.Amplifier;
import dp.facadepattern.HomeTheater.CdPlayer;
import dp.facadepattern.HomeTheater.DvdPlayer;
import dp.facadepattern.HomeTheater.PopcornPopper;
import dp.facadepattern.HomeTheater.Projector;
import dp.facadepattern.HomeTheater.Screen;
import dp.facadepattern.HomeTheater.TheatherLights;
import dp.facadepattern.HomeTheater.Tuner;

/**
 *
 * @author st801
 */
public class TestFacadePattern {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheatherLights(),
                new Screen(),
                new PopcornPopper()
        );
        
        homeTheater.watchMovie("復仇者聯盟");
        homeTheater.endMovie();
    }
}
