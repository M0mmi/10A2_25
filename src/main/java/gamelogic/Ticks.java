
package gamelogic;

import assets.actors.Enemy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Ticks {
    
    public int[][] map;

    public Ticks() {
        
        Timer EStandard = new Timer(9, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Standard.size(); i++) {
            Enemy.Standard.get(i).update();    
            }
        }); 
        EStandard.start();
        
        Timer EFast = new Timer(5, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Fast.size(); i++) {
            Enemy.Fast.get(i).update();    
            }
        }); 
        EFast.start();
        
        Timer ETank = new Timer(20, (ActionEvent e) -> {
            for (int i = 0; i < Enemy.Tank.size(); i++) {
            Enemy.Tank.get(i).update();    
            }
        }); 
        ETank.start();

    }

    public int[][] getMap() {
        return map;
    }
    
}
