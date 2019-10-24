/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    private boolean isDone = false;
    Tile t;
    
    public Bot(){
        percepts = new ArrayList();
        this.setBackground(Color.MAGENTA);
    }
    
    public void run(){
        isDone = false;
        
        try{
            while(isDone!=true){
                t = this.tile_location;
                System.out.println("attempting to step");
                    for(int i = 0; i < percepts.size(); i++){
                       t = percepts.get(i);
                       if(t.isExit){
                           t.enterBot(this);
                           this.isDone = true;
                       }
                       else if(!t.isVisited() && !t.isBlocking){
                            System.out.println("a path was not yet visited");
                            t.enterBot(this);
                            break;
                       }else if(i == percepts.size()-1){
                           Collections.sort(percepts, new SortByFrequency()); 
                           for(Tile visited_tile: percepts){
                               if(!visited_tile.isBlocking){
                                   visited_tile.enterBot(this);
                                   break;
                               }
                           }
                       }
                    }    
                updatePercepts();
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex){
        }
        
    }
    
    public void step(){
       t = this.tile_location;
       System.out.println("attempting to step");
       for(int i = 0; i < percepts.size(); i++){
           t = percepts.get(i);
           if(t.isExit){
               t.enterBot(this);
               this.isDone = true;
           }
           else if(!t.isVisited() && !t.isBlocking){
                System.out.println("a path has not yet visited");
                t.enterBot(this);
                break;
           }else if(i == percepts.size()-1){
               Collections.sort(percepts, new SortByFrequency()); 
               for(Tile visited_tile: percepts){
                   if(!visited_tile.isBlocking){
                       visited_tile.enterBot(this);
                       break;
                   }
               }
           }
        }
       updatePercepts();
    }
    
    public void updatePercepts(){
        this.percepts = tile_location.paths;
        System.out.println("Bot in Tile number" + this.tile_location.getName());
        for(Tile tile: percepts)
            System.out.println("Bot can see " + tile.getName());
    }
    
    public boolean getIsDone()
    {
        return this.isDone;
    }
    
}
