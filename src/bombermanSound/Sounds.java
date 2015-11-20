/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombermanSound;
import java.applet.AudioClip;
/**
 *
 * @author User
 */
public class Sounds {
    
    AudioClip sound;
    
    public void bomb(){
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/BombermanSound/bomb.wav"));
        sound.play();
    }
    
    public void startGame(){
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/BombermanSound/start.wav"));
        sound.play();
    }
    
    public void gaming(){
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/BombermanSound/gaming.wav"));
        sound.play();
    }
    
    public void victory(){
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/BombermanSound/victory.wav"));
        sound.play();
    }
    
    public void loser(){
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/BombermanSound/loser.wav"));
        sound.play();
    }
    
    public void stoped(){
        
        sound.stop();
    }
}
