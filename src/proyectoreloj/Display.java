/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreloj;


/**
 *
 * @author ped90
 */
public class Display {
    static boolean ledClock;
    static boolean ledAlarm;
    static boolean ledSet;
    
    /**
     * Displays the current clock time.
     */
    public static void showHour(){
        System.out.println(Clock.hourCurrent.getHour()+" : "+Clock.hourCurrent.getMinute());
    }
    
    /**
     * Led clock on (you are within the time change setting)
     * Led Alarm on (You are inside the alarm configuration)(If the bell (alarm) is on and SET is not, it means that the alarm is activated, not that you are inside the alarm configuration)
     * Led Set on ( With set on and the clock or the illuminated alarm means that these within the configuration of one or the other)
     * @param showClock
     * @param showAlarm
     * @param showSet 
     */
    public static void showLeds(boolean showClock, boolean showAlarm, boolean showSet){
        ledClock=showClock;
        ledAlarm=showAlarm;
        ledSet=showSet;
        
    }
    
}
