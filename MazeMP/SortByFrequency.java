/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;

import java.util.Comparator;

/**
 *
 * @author Phoebe
 */
public class SortByFrequency implements Comparator<Tile> {

    public SortByFrequency() {
    }
    
      @Override
      public int compare(Tile a, Tile b) 
    { 
        return a.visit_count - b.visit_count; 
    } 
}
