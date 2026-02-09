/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import assets.actors.Enemy;
import assets.actors.Tower;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int Tickcount = 0;
    static int Tickloop = 1;
    static int wave = 0;    
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        Tower p = new Tower(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());
        List<Enemy> Standard = new ArrayList<>();
        List<Enemy> Tank = new ArrayList<>();   
        List<Enemy> Fast = new ArrayList<>();
        Timer waves = new Timer();        
        TimerTask runwaves = new TimerTask() {
            @Override
            public void run() {            
            wave++;
            switch(wave){
                case 1:
        for (int i = 0; i < 3; i++) {
        Standard.add(new Enemy(5,5,50,5,0,0,null,"Standard"));            
        }
   /*     for (int i = 0; i < 3; i++) {
        Tank.add(new Enemy(5,5,50,5,0,0,null,"Tank"));           
        }
        for (int i = 0; i < 3; i++) {
        Fast.add(new Enemy(5,5,50,5,0,0,null,"Fast"));           
        }  */                  
                break;
                case 2:
                    System.out.println("yayy");
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                break;
                case 8:
                break;
                case 9:
                break;
                case 10:
                break;                
            }
            }
            
        };
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            if(Tickloop==41){
                Tickloop=21;
            }
                for (int i = 1; i < Tickloop; i++) {
                    if (Tickcount % i == 0) {
                    switch(i){
                        case 1:
                        break;
                        case 2: 
                        break;
                        case 3:
                        break;
                        case 4: 
                        break;
                        case 5: 
                            for (int j = 0; j < Fast.size(); j++) {
                            Fast.get(j).update();    
                            }                           
                        break;
                        case 6: 
                        break;
                        case 7: 
                        break;
                        case 8:
                            for (int j = 0; j < Standard.size(); j++) {
                            Standard.get(j).update();    
                            }                            
                        break;
                        case 9:  
                        break;
                        case 10: 
                        break;    
                        case 11:   
                        break;    
                        case 12: 
                         for (int j = 0; j < Tank.size(); j++) {
                            Tank.get(j).update();  }
                        break;    
                        case 13: 
                        break;    
                        case 14: 
                        break;    
                        case 15: 
                        break;    
                        case 16: 
                        break;
                        case 17: 
                        break;
                        case 18: 
                        break;    
                        case 19:
                        break;
                        case 20:  
                            if (Standard.size()>=1) {
                        Standard.remove(Standard.size()-1);        
                            }
                        break;
                    }   
                    }
    
                }
            Tickcount++; 
            Tickloop++;
                if (Standard.isEmpty() && Fast.isEmpty() && Tank.isEmpty()) {    
                waves.schedule(runwaves, 1200);    
                }
            }
        };

            timer.scheduleAtFixedRate(timerTask,0, 100);
    }
}
