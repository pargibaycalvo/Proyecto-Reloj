/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreloj;

import java.time.LocalTime;
import static proyectoreloj.Clock.alarm;

/**
 *
 * @author ped90
 */
public class Buttons {
    static boolean alarmActive;
    static boolean setHour;
    static boolean setAlarm;
    /**
     * Button ON
     * Activate the alarm to sound at the time you have set
     * When the set time coincides with the minutes and seconds saved, it skips apart from already displaying the stored alarm
     */
    public static void alarmON(){
        Display.showLeds(true,false,false);
        System.out.println("Alarm Actived");
    }
    /**
     * Button OFF
     * Turn off the alarm so it does not ring at the time you have set
     */
    public static void alarmOFF(){
        Display.showLeds(false,false,false);
        System.out.println("Alarm Disable");
    }
    /**
     * Button clock
     * By pressing the SET clock button, set the time
     */
    public static void configHour(){
        Display.showLeds(true, false, true);
        Display.showHour();   
    }
    /**
     * Button bell
     * By pressing the SET alarm button, set the alarm
     */
    public static void configAlarm(){
        Display.showLeds(true,false,false);
        alarm = LocalTime.now().plusMinutes(1);
        System.out.println("Alarm Saved :" + alarm.getMinute() + ":" + alarm.getSecond());
    }
    /**
     * Button "+" to increase hour 
     * This function is used to change both the clock and alarm settings
     */
    public static void plusHour(){
        if (Display.ledSet == true) {
            if (Display.ledClock == true) {
                Clock.hourCurrent = Clock.hourCurrent.plusHours(1);
                Display.showHour();
            } else {
                Clock.alarm = Clock.alarm.plusHours(1);
                Display.showAlarm();
            }
        }
    }
    /**
     * Button "+" to increase minutes
     * This function is used to change both the clock and alarm settings
     */
    public static void plusMinutes(){
        if (Display.ledSet == true) {
            if (Display.ledClock == true) {
                Clock.hourCurrent = Clock.hourCurrent.plusMinutes(1);
                Display.showHour();
            } else {
                Clock.alarm = Clock.alarm.plusMinutes(1);
                Display.showAlarm();
            }
        }
    }
    /**
     * Button up the clock
     * Button "stop" to stop the alarm when it rings
     */
    public static void stopAlarm(){
        System.out.println("STOP ALARM");
        Speaker.StopSound();
        
    }
    
    
    
    
}
