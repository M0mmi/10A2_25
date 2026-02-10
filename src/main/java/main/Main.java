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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    static int Tickcount = 0;
    static int Tickloop = 1;
    static int wave = 1; 
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        Tower p = new Tower(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());

//ScheduledExecutorService runwaves = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 3; i++) {
        Enemy.Standard.add(new Enemy(5,5,50,5,0,0,null,"Standard"));     
        }
   /*     for (int i = 0; i < 3; i++) {
        Tank.add(new Enemy(5,5,50,5,0,0,null,"Tank"));           
        }
        for (int i = 0; i < 3; i++) {
        Fast.add(new Enemy(5,5,50,5,0,0,null,"Fast"));           
        }  */       
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
                            for (int j = 0; j < Enemy.Fast.size(); j++) {
                            Enemy.Fast.get(j).update();    
                            }                           
                        break;
                        case 6: 
                        break;
                        case 7: 
                        break;
                        case 8:
                            for (int j = 0; j < Enemy.Standard.size(); j++) {
                            Enemy.Standard.get(j).update();    
                            }                            
                        break;
                        case 9:  
                        break;
                        case 10: 
                        break;    
                        case 11:   
                        break;    
                        case 12: 
                         for (int j = 0; j < Enemy.Tank.size(); j++) {
                            Enemy.Tank.get(j).update();  }
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
                        break;
                    }   
                    }
    
                }
            Tickcount++; 
            Tickloop++;
                if (Enemy.Standard.isEmpty() && Enemy.Fast.isEmpty() && Enemy.Tank.isEmpty()) {        
        wave++; 
            switch(wave){
                case 2:
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
//runwaves.schedule(() -> {
//}, 1200, TimeUnit.MILLISECONDS);    
                }            
            }
        };

            timer.scheduleAtFixedRate(timerTask,0, 100);
   
    }       
}
