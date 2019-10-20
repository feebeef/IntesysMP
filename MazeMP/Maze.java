/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author Phoebe
 */
public class Maze extends JPanel{
    
    int grid_size;
    HashMap<Integer, Tile> tiles;
    public JPanel mazeView;
    boolean editmode = false;
    
    public Maze(){
        tiles = new HashMap();
        this.mazeView = this;
    }
    
    //aldous algo
    public void autoGenerateMaze(){
        //aldous algo
    }
    
    //initialize grids lahat may border
    public void createGrid(int grid_size){
        GridLayout gp = new GridLayout(grid_size, grid_size);
        mazeView.setLayout(gp);
        
        //map tiles
        int id = 1;
        for(int i = 0; i < grid_size; i++){
            for(int j = 0; j < grid_size; j++){
                Tile t = new Tile();
                t.setName(String.valueOf(id));
                mazeView.add(t);
                tiles.put(id, t);
                id++; 
                t.maze = this;
            }
        }
        
        //adjacent tiles
        id = 1;
        for(int i = 0; i < grid_size; i++){
            for(int j = 0; j < grid_size; j++){
                Tile t = tiles.get(id);
                if(j < grid_size-1 && !t.hasPath(tiles.get(id+1))){
                        t.addPath(tiles.get(id+1));
                }
                if(i < grid_size - 1 && !t.hasPath(tiles.get(id+grid_size))){    
                        t.addPath(tiles.get(id+grid_size));
                }
                id++;
            }
        }
       
    }
   
    
    public void setBot(Bot bot){
       Tile t = tiles.get(2);
       t.enterBot(bot);
    }
    
    public void enableBlockingTilePlacement(){
        for(Tile t: tiles.values()){
                t.blockingChange = true;
                 t.exitChange = false;
            t.nonBlockingChange = false;
        }
    }
    
    public void enableNonBlockingTilePlaceMent(){
         for(Tile t: tiles.values()){
            t.blockingChange = false;
            t.exitChange = false;
            t.nonBlockingChange = true;
        }
    }
    
    public void enableExitTilePlaceMent(){
        for(Tile t: tiles.values()){
            t.blockingChange = false;
            t.nonBlockingChange = false;
            t.exitChange = true;
        }
    }
    
    public static Maze createMaze(){
        return new Maze();
    }
    
    @Override
    public String toString(){
        return "Maze";
    }
    
}
