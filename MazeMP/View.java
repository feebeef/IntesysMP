/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MazeMP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;

/**
 *
 * @author Phoebe
 */
public class View extends javax.swing.JFrame {
    BufferedImage image;
    Maze m;
    Bot b;
    int count = -1;
    
    public View() {
        initComponents();
        getContentPane().setBackground(new Color(39,32,49));
        design();
    }
    
    public void addMaze(Maze m){
        this.m = m;
        this.container.setViewportView(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winWindow = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        controller = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                try{
                    image = ImageIO.read(getClass().getResource("/Resources/bar.png"));
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        btnRun = new javax.swing.JLabel();
        btnStop = new javax.swing.JLabel();
        btnStep = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStep = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnSetBot = new javax.swing.JLabel();
        container = new javax.swing.JScrollPane();

        javax.swing.GroupLayout winWindowLayout = new javax.swing.GroupLayout(winWindow.getContentPane());
        winWindow.getContentPane().setLayout(winWindowLayout);
        winWindowLayout.setHorizontalGroup(
            winWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOptionPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        winWindowLayout.setVerticalGroup(
            winWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOptionPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));

        controller.setBackground(new java.awt.Color(39, 32, 49));

        btnRun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/runbtn.png"))); // NOI18N
        btnRun.setText("Run");
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/stopbtn.png"))); // NOI18N
        btnStop.setText("Stop");

        btnStep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/stepbtn.png"))); // NOI18N
        btnStep.setText("Step");
        btnStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStepMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Steps");

        txtStep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStep.setText("0");

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/editbtn.png"))); // NOI18N
        btnEdit.setText("Change Maze");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnSetBot.setText("Start");
        btnSetBot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetBotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controllerLayout = new javax.swing.GroupLayout(controller);
        controller.setLayout(controllerLayout);
        controllerLayout.setHorizontalGroup(
            controllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controllerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnStep)
                .addGap(18, 18, 18)
                .addComponent(btnRun)
                .addGap(18, 18, 18)
                .addComponent(btnStop)
                .addGap(62, 62, 62)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStep)
                .addGap(105, 105, 105)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnSetBot)
                .addGap(34, 34, 34))
        );
        controllerLayout.setVerticalGroup(
            controllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(controllerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStop)
                    .addComponent(btnRun)
                    .addComponent(btnStep)
                    .addComponent(jLabel4)
                    .addComponent(txtStep, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetBot))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(container)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(controller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        MazeGenerator mg = MazeGenerator.showeditor();
        mg.setContainer(this);
        mg.setVisible(true);
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnSetBotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetBotMouseClicked
       System.out.println("Add Bot");
       if(m!=null){
           b = new Bot();
            m.setBot(b);
            b.setSize(100, 100);
            b.setVisible(true);  
       }
    }//GEN-LAST:event_btnSetBotMouseClicked

    private void btnStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStepMouseClicked
        b.step();
        count++;
        txtStep.setText(String.valueOf(count));
        if(b.getIsDone())
        {
            winWindow.setAlwaysOnTop(rootPaneCheckingEnabled);
            jOptionPane1.showMessageDialog(winWindow, "You Win!");
        }
    }//GEN-LAST:event_btnStepMouseClicked

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        b.run();
        if(b.getIsDone()){
            winWindow.setAlwaysOnTop(rootPaneCheckingEnabled);
            jOptionPane1.showMessageDialog(winWindow, "You Win!");
        }
    }//GEN-LAST:event_btnRunMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnRun;
    private javax.swing.JLabel btnSetBot;
    private javax.swing.JLabel btnStep;
    private javax.swing.JLabel btnStop;
    public javax.swing.JScrollPane container;
    private javax.swing.JPanel controller;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel txtStep;
    private javax.swing.JDialog winWindow;
    // End of variables declaration//GEN-END:variables
    
    public void design(){
        container.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
    }
    


}
