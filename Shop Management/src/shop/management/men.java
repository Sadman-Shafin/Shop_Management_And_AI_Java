
package shop.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class men extends javax.swing.JFrame {

   
    public men() {
        super("men");
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sprice = new javax.swing.JLabel();
        squantity = new javax.swing.JTextField();
        sbuy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pprice = new javax.swing.JLabel();
        pquantity = new javax.swing.JTextField();
        pqbuy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        shprice = new javax.swing.JLabel();
        shquantity = new javax.swing.JTextField();
        shbuy = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        scode = new javax.swing.JComboBox<>();
        pcode = new javax.swing.JComboBox<>();
        shcode = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shirt");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Men");

        sprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sprice.setForeground(new java.awt.Color(255, 255, 255));
        sprice.setText("1500");

        squantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        squantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squantityActionPerformed(evt);
            }
        });

        sbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sbuy.setText("Buy");
        sbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pant");

        pprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pprice.setForeground(new java.awt.Color(255, 255, 255));
        pprice.setText("2500");

        pquantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pquantityActionPerformed(evt);
            }
        });

        pqbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pqbuy.setText("Buy");
        pqbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqbuyActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Shoes");

        shprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shprice.setForeground(new java.awt.Color(255, 255, 255));
        shprice.setText("1200");

        shquantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shquantityActionPerformed(evt);
            }
        });

        shbuy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shbuy.setText("Buy");
        shbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shbuyActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Code");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Item");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        scode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S-1", "S-2", "S-3", "S-4" }));
        scode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scodeActionPerformed(evt);
            }
        });

        pcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P-1", "P-2", "P-3", "P-4", " " }));

        shcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SH-1", "SH-2", "SH-3", "SH-4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(shcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(sprice)
                                                    .addComponent(pprice)
                                                    .addComponent(shprice)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(jLabel16)))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(shquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(squantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pqbuy)
                                    .addComponent(shbuy)
                                    .addComponent(sbuy)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(233, 233, 233)
                                .addComponent(jLabel15))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sprice)
                    .addComponent(squantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbuy)
                    .addComponent(scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pprice)
                    .addComponent(pquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pqbuy)
                    .addComponent(pcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(shprice)
                    .addComponent(shquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shbuy)
                    .addComponent(shcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(691, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void squantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_squantityActionPerformed

    private void pquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pquantityActionPerformed

    private void shquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shquantityActionPerformed

    private void sbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuyActionPerformed
   String sc = String.valueOf(scode.getSelectedItem());
        String sp = sprice.getText();
        String sq = squantity.getText();
        if(sc.isEmpty() || sp.isEmpty() || sq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO shirt (scode,sprice,squantity) VALUES(?,?,?)");



            st.setString(1, sc);
            st.setString(2, sp);
            st.setString(3, sq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            sprice.setText("");
            sprice.requestFocus();
            scode.setSelectedItem("");
            squantity.setText("");

        }

        }
    }                                    

    private void mbuyActionPerformed(java.awt.event.ActionEvent evt) {                                     
     
    }//GEN-LAST:event_sbuyActionPerformed

    private void pqbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqbuyActionPerformed
       String pc = String.valueOf(pcode.getSelectedItem());
        String pp = pprice.getText();
        String pq = pquantity.getText();
        if(pc.isEmpty() || pp.isEmpty() ||pq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO pant (pcode,pprice,pquantity) VALUES(?,?,?)");



            st.setString(1, pc);
            st.setString(2, pp);
            st.setString(3, pq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            pprice.setText("");
            pprice.requestFocus();
            pcode.setSelectedItem("");
            pquantity.setText("");

        }

        }
    }//GEN-LAST:event_pqbuyActionPerformed

    private void shbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shbuyActionPerformed
 String shc = String.valueOf(shcode.getSelectedItem());
        String shp = shprice.getText();
        String shq = shquantity.getText();
        if(shc.isEmpty() || shp.isEmpty() ||shq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO mshoes (shcode,shprice,mshuantity) VALUES(?,?,?)");



            st.setString(1, shc);
            st.setString(2, shp);
            st.setString(3, shq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            shprice.setText("");
            shprice.requestFocus();
            shcode.setSelectedItem("");
            shquantity.setText("");

        }

        }       
    }//GEN-LAST:event_shbuyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 fashion fh = new fashion();
        fh.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void scodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scodeActionPerformed

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
            java.util.logging.Logger.getLogger(men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(men.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new men().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pcode;
    private javax.swing.JLabel pprice;
    private javax.swing.JButton pqbuy;
    private javax.swing.JTextField pquantity;
    private javax.swing.JButton sbuy;
    private javax.swing.JComboBox<String> scode;
    private javax.swing.JButton shbuy;
    private javax.swing.JComboBox<String> shcode;
    private javax.swing.JLabel shprice;
    private javax.swing.JTextField shquantity;
    private javax.swing.JLabel sprice;
    private javax.swing.JTextField squantity;
    // End of variables declaration//GEN-END:variables
}
