/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;

public class MazeGenerator extends javax.swing.JFrame {

     Maze m;
     Boolean blockingtile;
     View container;
     
    public MazeGenerator() {
        initComponents();
        setMaze(8);
        selectGridSize.addItemListener((ItemEvent e) -> {
            String item = selectGridSize.getSelectedItem().toString().split("x")[0].trim();
            setMaze(Integer.parseInt(item));
        });
    }
    
    public void setContainer(View container){
        this.container = container;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectGridSize = new javax.swing.JComboBox<>();
        btnBlock = new javax.swing.JLabel();
        btnNonBlock = new javax.swing.JLabel();
        mazecontainer = new javax.swing.JPanel();
        btnDone = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        btnRandom = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        for(int i = 8; i < 65; i++){
            selectGridSize.addItem(i + " x " + i);
        }
        selectGridSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGridSizeActionPerformed(evt);
            }
        });

        btnBlock.setText("Blocking");
        btnBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlockMouseClicked(evt);
            }
        });

        btnNonBlock.setText("Nonblocking");
        btnNonBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNonBlockMouseClicked(evt);
            }
        });

        mazecontainer.setLayout(new java.awt.CardLayout());

        btnDone.setText("Done");
        btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoneMouseClicked(evt);
            }
        });

        btnCancel.setText("Cancel");

        btnRandom.setText("Random");
        btnRandom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRandomMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBlock)
                .addGap(39, 39, 39)
                .addComponent(btnNonBlock)
                .addGap(35, 35, 35)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnRandom)
                .addGap(32, 32, 32)
                .addComponent(btnDone)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(20, 20, 20))
            .addComponent(mazecontainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGridSize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlock)
                    .addComponent(btnDone)
                    .addComponent(btnCancel)
                    .addComponent(btnNonBlock)
                    .addComponent(btnRandom)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(mazecontainer, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectGridSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGridSizeActionPerformed
        blockingtile = true;
    }//GEN-LAST:event_selectGridSizeActionPerformed

    private void btnNonBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNonBlockMouseClicked
        m.enableNonBlockingTilePlaceMent();
    }//GEN-LAST:event_btnNonBlockMouseClicked

    private void btnBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlockMouseClicked
        m.enableBlockingTilePlacement();
    }//GEN-LAST:event_btnBlockMouseClicked

    private void btnDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoneMouseClicked
        container.addMaze(m);
        this.dispose();
    }//GEN-LAST:event_btnDoneMouseClicked

    private void btnRandomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRandomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRandomMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        m.enableExitTilePlaceMent();
    }//GEN-LAST:event_btnExitMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBlock;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnDone;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnNonBlock;
    private javax.swing.JLabel btnRandom;
    private javax.swing.JPanel mazecontainer;
    private javax.swing.JComboBox<String> selectGridSize;
    // End of variables declaration//GEN-END:variables

    public void setMaze(int gridSize){
        if(m != null){
            mazecontainer.remove(m);
        }
        
        m = Maze.createMaze();
        m.createGrid(gridSize);
        mazecontainer.add(m);
        
        mazecontainer.revalidate();
        mazecontainer.repaint();
    }
    
    public static MazeGenerator showeditor(){
        return new MazeGenerator();
    }
    
}
       
