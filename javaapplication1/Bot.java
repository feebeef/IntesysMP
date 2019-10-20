/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Phoebe
 */
public class Bot extends JPanel{
    
    ArrayList<Tile> percepts;
    Tile tile_location;
    int x = 0;
    int y = 0;
    public Bot(){
        percepts = new ArrayList();
        this.setBackground(Color.MAGENTA);
    }
    
    public void step(){
       Tile t = tile_location;
       for(int i = 0; i < percepts.size(); i++){
           t = percepts.get(i);
           if(!t.isVisited && !t.isBlocking){
                tile_location.remove(this);
                this.percepts.clear();
                t.enterBot(this);
                break;
           }
    }
       
       
    }
    
    public void move(Tile t, ArrayList<Tile> percepts){
        this.tile_location = t;
        this.percepts = percepts;
        System.out.println("Bot in Tile number" + this.tile_location.getName());
    }
    
    
}
