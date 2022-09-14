/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.egyption_league;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mmmme
 */
public class Team_matches extends javax.swing.JFrame {
    Connection con;
     DefaultTableModel t;
     int x=0;
    /**
     * Creates new form Team_matches
     */
     public Team_matches(String g) {
        initComponents();
        
        x=1;
        
        
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Egyption_league_data", "root", "root");
              
        } catch (Exception e) {
 JOptionPane.showMessageDialog(this, "connection faild");        }
            fill_combo();
  jComboBox1.setSelectedItem(g);
    
         
        try {     t=new DefaultTableModel();
        t.addColumn("Match ID");
        t.addColumn("Opposite Team");
        t.addColumn("Score");
        t.addColumn("Referee");
        t.addColumn("Stadium");
        t.addColumn("Date");
            
            
            PreparedStatement stmt=con.prepareCall("select * from matches where team1=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
           ResultSet rs= stmt.executeQuery();
           while(rs.next()){
                   t.addRow(new Object[]{rs.getInt(1),rs.getString(7),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
                   stmt=con.prepareCall("select * from matches where team2=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
            rs= stmt.executeQuery();
             while(rs.next()){
            t.addRow(new Object[]{rs.getInt(1),rs.getString(6),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
            jTable1.setModel(t);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
           t=null;
        } catch (Exception e) {JOptionPane.showMessageDialog(this, "error"); 
        }
    }
    public Team_matches() {
        initComponents();
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Egyption_league_data", "root", "root");
              
        } catch (Exception e) {
 JOptionPane.showMessageDialog(this, "connection faild");        }
  
        fill_combo();
         
        try {     t=new DefaultTableModel();
        t.addColumn("Match ID");
        t.addColumn("Opposite Team");
        t.addColumn("Score");
        t.addColumn("Referee");
        t.addColumn("Stadium");
        t.addColumn("Date");
            
            
            PreparedStatement stmt=con.prepareCall("select * from matches where team1=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
           ResultSet rs= stmt.executeQuery();
           while(rs.next()){
                   t.addRow(new Object[]{rs.getInt(1),rs.getString(7),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
                   stmt=con.prepareCall("select * from matches where team2=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
            rs= stmt.executeQuery();
             while(rs.next()){
            t.addRow(new Object[]{rs.getInt(1),rs.getString(6),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
            jTable1.setModel(t);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
           t=null;
        } catch (Exception e) {JOptionPane.showMessageDialog(this, "error"); 
        }
    }
    public void fill_combo(){
       PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("select name from teams");
              ResultSet rs=stmt.executeQuery();
        while(rs.next()){
       
        jComboBox1.addItem(rs.getString(1));
        
    
        }} catch (SQLException ex) {
            Logger.getLogger(Team_matches.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        }
    
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 39, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Team Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 100, 340, 33));

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Egyptian League DATA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Match ID", "Opposite Team", "Score", "Referee", "Stadium", "Date"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setPreferredSize(new java.awt.Dimension(1000, 1020));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackagei/artboard_26.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
        if(x==0){
        Teams s= new Teams();
        s.setVisible(true);
        s.setLocation(this.location());
        this.setVisible(false);}
        else
        {
          Disply_team_info s= new Disply_team_info();
        s.setVisible(true);
        s.setLocation(this.location());
        this.setVisible(false);
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
 
        try {     t=new DefaultTableModel();
        t.addColumn("Match ID");
        t.addColumn("Opposite Team");
        t.addColumn("Score");
        t.addColumn("Referee");
        t.addColumn("Stadium");
        t.addColumn("Date");
            
            
            PreparedStatement stmt=con.prepareCall("select * from matches where team1=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
           ResultSet rs= stmt.executeQuery();
           while(rs.next()){
                   t.addRow(new Object[]{rs.getInt(1),rs.getString(7),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
                   stmt=con.prepareCall("select * from matches where team2=?  ");
            stmt.setString(1, jComboBox1.getSelectedItem().toString());
            rs= stmt.executeQuery();
             while(rs.next()){
            t.addRow(new Object[]{rs.getInt(1),rs.getString(6),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2)});}
            jTable1.setModel(t);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
                  for (int o = 0; o <15; o++) {
                t.addRow(new Object[0]);
                
            }
           t=null;
        } catch (Exception e) {JOptionPane.showMessageDialog(this, "error"); 
        }    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Team_matches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Team_matches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Team_matches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Team_matches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Team_matches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
