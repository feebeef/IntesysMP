/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Phoebe
 */
public class Tile extends JPanel{
    ArrayList<Tile> paths;
    BufferedImage image;
    boolean nonBlockingChange = false;  //allows changing of tile to nonblocking tile
    boolean blockingChange = false;//allows changing of tile to blocking tile
    boolean exitChange = false; //allows changing of tile to exit
    boolean isVisited;
    boolean isExit = false;
    boolean isBlocking = false;
    Maze maze;
    
    public Tile() {
        this.setLayout(new CardLayout());
       this.setBackground(Color.cyan);
       this.setBorder(BorderFactory.createLineBorder(Color.cyan));
       this.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent me){
               if(nonBlockingChange){
                   setNonBlocking();
               }else if(blockingChange)
                   setBlocking();
               else if(exitChange)
                   setExit();
           }
       });
       
       paths = new ArrayList();
       isVisited = false;
       
    }
    
    public void removePath(Tile t){
        paths.remove(t);
    }
    
    public void setBlocking(){
       this.setBackground(Color.black);
       this.repaint();
       this.revalidate();
       this.isBlocking = true;
      isExit = false;
    }
    
    public void setExit(){
        this.setBackground(Color.green);
         this.repaint();
       this.revalidate();
       this.isExit = true;
       this.isBlocking = false;
       this.isBlocking = false;
        
    }
    
    public void setNonBlocking(){
         this.setBackground(Color.cyan);
         this.repaint();
       this.revalidate();
       this.isBlocking = false;
       this.isExit = false;
    }
    
    
        @Override
    public String toString(){
        return this.getName();
    }
    
    public void enterBot(Bot b){
        isVisited = true;
        b.move(this, paths);
        this.add(b);
        b.setLocation(this.getLocation());
        this.repaint();
        this.revalidate();
    }
    
    public void addPath(Tile t){
            this.paths.add(t);
            
          if(!t.hasPath(this))
            t.addPath(this);
        
    }
    
    public boolean hasPath(Tile t){
        if(paths.isEmpty())
            return false;
        else if(paths.contains(t))
            return true;
        else return false;
    }
}
