/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import assets.actors.Enemy;
import assets.actors.Tower;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Enemy one[] = {null,null,null,null,null};
    static Enemy eight[] = {null,null,null,null,null};
    static int Tickcount = 0;
    static int Tickloop = 1;
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        Tower p = new Tower(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());
        Enemy fish = new Enemy(5,5,50,5,0,0,null,"Fish");
        Enemy banana = new Enemy(8,3,85,7,0,0,null,"Banana");
        Timer timer = new Timer();
    one[0] = fish;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            if(Tickloop==20){
                Tickloop=1;
            }
                for (int i = 0; i < Tickloop; i++) {
                    if (Tickcount % i == 0) {
                    switch(i){
                        case 1:
                        for (Enemy one1 : one) {
                            one1.update();
                        }

                        case 2: 
                        case 3:
                        banana.update();
                        case 4:    
                        case 5: 
                        fish.update();
                        case 6: 
                        case 7: 
                        case 8:   
                        for (Enemy eight1 : eight) {
                            eight1.update();
                        }

                        case 9:    
                        case 10: 
                        case 11: 
                        case 12:  
                        case 13:    
                        case 14: 
                        case 15: 
                        case 16: 
                        case 17:    
                        case 18: 
                        case 19: 
                        case 20:                             
                    }   
                    }
    
                }
            Tickcount++; 
            Tickloop++;
            }
        };
        while (true) {
            timer.schedule(timerTask, 100);
        }
    }
}
