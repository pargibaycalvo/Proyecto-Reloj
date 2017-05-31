/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreloj;


import java.time.LocalTime;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class Clock {
    /**
     */
    static public LocalTime hourCurrent;
    static public LocalTime alarm;
    
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Physical clock
         * This is the physical clock that we would have in front with the buttons and all the configurations
         */
        hourCurrent=LocalTime.now();
        int opcion;
        int opcion2;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Show current time.  \n2) SET Hour. \n3) SET Alarm. \n4) ON/OFF Alarm & Alarm saved. \n5) STOP ALARM. \n0) Exit."));
        switch(opcion){
            case 1:
                Display.showHour();
                break;
            case 2:
               Buttons.configHour();
               Buttons.plusHour();
               Buttons.plusMinutes();
                break;
            case 3:
                Buttons.configAlarm();
                Buttons.plusHour();
                Buttons.plusMinutes();
                break;
            case 4:
                do{
                    opcion2= Integer.parseInt(JOptionPane.showInputDialog("1)ON Alarm. \n2)OFF Alarm. \n0)Return Menu."));
                    switch(opcion2){
                        case 1:
                            Buttons.alarmON();
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
                            break;
                        case 2:
                            Buttons.alarmOFF();
                            break;
                    }
                }while(opcion2!=0);  
                break;
            case 5:
                Buttons.stopAlarm();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Exit");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
        }
    }while(opcion!=0);
    }

    }
    

