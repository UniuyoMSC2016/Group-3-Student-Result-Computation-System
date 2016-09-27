/**
 *
 * @author Ny
 */

import javax.swing.*;


public class MainUI extends javax.swing.JPanel {

    private Screen scr;
    private JFrame frm;
    
    public MainUI() {
        
        initComponents();
        
        scr = new Screen();
        frm = new JFrame();
        
        int x = scr.x(100);
        int y = scr.y(100);
        
        frm.setSize(x, y);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(this);
        frm.setUndecorated(true);
        frm.setVisible(true);
        
        
        pos( close, 97, 0, 3, 3);
       
    }

   
    
    //utility method:component positioning
    public void pos(JComponent cmp, int px, int py, int w, int h)
    {
        cmp.setBounds( scr.x(px), scr.y(py), scr.x(w), scr.y(h) );
        this.add(cmp);
    }
    
    
    public static void main(String arg[])
    {
        new MainUI();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(0, 255, 204));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        add(close);
        close.setBounds(870, 4, 15, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("SELECT STUDENT:");
        add(jLabel1);
        jLabel1.setBounds(10, 10, 220, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
