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
public class Speaker {
    String melody;
    static boolean ringON;
    
    /**
     *When the time matches the saved alarm, the music you have set will sound     
     */
        public static void playSound(){
        System.out.println("Music favorite");
        
    }
    /**
     * Check message that the alarm was stopped by pressing the stop button
     */
        public static void StopSound(){
             System.out.println("Alarm disabel");
        }
    
}
