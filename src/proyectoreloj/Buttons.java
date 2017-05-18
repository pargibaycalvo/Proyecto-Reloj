/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreloj;

import java.time.LocalTime;
import java.util.TimerTask;
import javax.swing.JOptionPane;
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
        alarm = LocalTime.now().plusMinutes(1);
        System.out.println("Alarm Saved :" + alarm.getMinute() + ":" + alarm.getSecond());
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (alarm.getMinute() == LocalTime.now().getMinute()) {
                    System.out.println("¡¡¡ALARMA!!!");
                } else {
                    System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond());
                }
            }
        };
    }
    /**
     * Button OFF
     * Turn off the alarm so it does not ring at the time you have set
     */
    public static void alarmOFF(){
        Display.showLeds(false,false,false);
        JOptionPane.showMessageDialog(null,"Alarm Disable");
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
    }
    /**
     * Button "+" to increase hour 
     * This function is used to change both the clock and alarm settings
     */
    public static void plusHour(){
        Clock.hourCurrent.plusHours(Integer.parseInt(JOptionPane.showInputDialog("Enter the desired time")));
        Display.showHour();
        
    }
    /**
     * Button "+" to increase minutes
     * This function is used to change both the clock and alarm settings
     */
    public static void plusMinutes(){
        Clock.hourCurrent.plusMinutes(Integer.parseInt(JOptionPane.showInputDialog("Enter the desired minutes")));
        Display.showHour();
    
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
