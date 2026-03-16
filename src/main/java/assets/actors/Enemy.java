package assets.actors;

import assets.GameAsset;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import main.Main;
import main.Tiles;
import main.lilC;
import gamelogic.Ticks;
public class Enemy extends GameAsset {


static Enemy Enemy;
public static ArrayList<Enemy> Standard = new ArrayList<>();
public static ArrayList<Enemy> Tank = new ArrayList<>();
public static ArrayList<Enemy> Fast = new ArrayList<>();
    double damage;
    int velocity, healthpoints, bounty;
    private int tile;

    public Enemy(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.damage = 10;
        this.velocity = 5;
        this.healthpoints = 100;
        this.bounty = 5;
        this.tile = 3;

    }

    public Enemy(double damage, int velocity, int healthpoints, int bounty, int x, int y, ImageIcon img, String name) {
        super(x,y,img, name);
        this.damage = damage;
        this.velocity = velocity;
        this.healthpoints = healthpoints;
        this.bounty = bounty;
        this.tile = 3;
    }
    
    
    public void update() {
        System.out.println("X:"+this.getX()+"Y:"+this.getY());
        //wenn die Funktion null ist, dann sind Gegner am Ende-> Schaden machen
        if (Main.getNextTile(tile) == null) {
        doDamage(damage);    
        }
        //x und y des nächsten Tiles
        else{
        int deltaX = Main.getNextTile(tile).getX();
        int deltaY = Main.getNextTile(tile).getY();
        //Gegner auf x und y bewegen, bis Differenz zwischen Gegner und dem nächsten Tile auf x und y 0 ist
        if (deltaX != getX()) {
            if (deltaX > getX()) {
            this.setX(getX()+1);                
            }
            else{
            this.setX(getX()-1);                
            }
        }
           
        if (deltaY != getY()) {
            if (deltaY > getY()) {
            this.setY(getY()+1);                 
            }
            else{
            this.setY(getY()-1);                
            }            
        }
        //Wenn Gegner auf dem nächsten Tile ist, Id des Feldes, auf dem Gegner ist, aktualisieren 
       if (deltaX == getX() && deltaY == getY()) {
           this.tile = Main.getNextTile(tile).getID();
       }
    }       
    }
    public double getDamage() {
        return damage;
    }


    public int getVelocity() {
        return velocity;
    }


    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }
    public void takeDamage(int damage){
    //Schaden nehmen, wenn weniger als 0, sterben
    this.healthpoints -= damage;
        if (healthpoints <= 0) {
        this.die();    
        }
    }
    public int die(){
    //Jeden Gegner in der jeweiligen Liste suchen und löschen, der keine Leben mehr hat
        for (int i = 0; i < Standard.size(); i++) {
            if (Standard.get(i).healthpoints <= 0) {
            Standard.remove(i);
                System.out.println("Standard removed!");
            }    
        }
        for (int i = 0; i < Tank.size(); i++) {
            if (Tank.get(i).healthpoints <= 0) {
            Tank.remove(i);
            }    
        }
        for (int i = 0; i < Fast.size(); i++) {
            if (Fast.get(i).healthpoints <= 0) {
            Fast.remove(i);
            }    
        }
    //Wenn keine Gegner mehr auf dem Feld sind, nächste Wave starten        
        if (Standard.isEmpty() && Fast.isEmpty() && Tank.isEmpty()) {
        Main.wave++;            
        Main.waves(Main.wave);
        }
    return bounty;
    }
    public int getBounty() {
        return bounty;
    }
    //Gegner machen Schaden am Ziel
    public void doDamage(double damage){  
    Main.Healthbase-= damage;
        System.out.println("health: "+Main.Healthbase);
    }
}
