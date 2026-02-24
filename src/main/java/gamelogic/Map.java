
package gamelogic;


public class Map {
    
    int[][] map;

    public Map() {
        this.map = new int[][] {{0,0,1,0},{0,0,1,0},{0,0,1,1}};
    }

    public int[][] getMap() {
        return map;
    }
    
}
