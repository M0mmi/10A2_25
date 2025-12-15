package assets.actors;

import assets.GameAsset;
import javax.swing.ImageIcon;

public class Tower extends GameAsset {
    
    int upgradeCost, upgradeCostFlowers, damage, fireRate, range;
    
    public Tower(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = 500;
        this.upgradeCostFlowers = 3;
        this.damage = 20;
        this.fireRate = 2;
        this.range = 3;
        
    }

    public Tower(int upgradeCost, int upgradeCostFlowers, int damage, int fireRate, int range, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = upgradeCost;
        this.upgradeCostFlowers = upgradeCostFlowers;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
    }

    
    
    public void shoot () {

    }
    
    public void upgrade () {

    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public int getUpgradeCostFlowers() {
        return upgradeCostFlowers;
    }

    public int getDamage() {
        return damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRange() {
        return range;
    }
    
    
    
}
