
package gamelogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Map {
    
    public int[][] map;

    public Map() {
        /*
        Timer t = new Timer(50, (ActionEvent e) -> {
            System.out.println("T1");
        }); 
        t.start();
        
        Timer t2 = new Timer(150, (ActionEvent e) -> {
            System.out.println("T2");
        }); 
        t2.start();
        
        Timer t3 = new Timer(300, (ActionEvent e) -> {
            System.out.println("T3");
        }); 
        t3.start();
*/
    }

    public int[][] getMap() {
        return map;
    }
    
}
